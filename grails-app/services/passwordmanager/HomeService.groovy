package passwordmanager

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic


@Transactional
class HomeService {

    CryptographicService cryptographicService
    def messageSource
    EmailService emailService

    static final String DEFAULT_EMAIL="rajeesh.kulangara@gmail.com"

    def  validateAndSave(Account account) {
        def result = [:]
        try {
            if (account.hasErrors() == false && account.validate() && account.save(failOnError: true, flush: true)) {
                result = [account: account, success: true]
            } else {
                result = [errors: account.errors.allErrors.collect {
                    messageSource.getMessage(it, null)
                }, success      : false]
            }
        } catch (ex) {
            result = [errors: 'Unable to save the account', success: false]
        }
        return result
    }


    def saveAccount(Account account , String secretKey){
        account.username=cryptographicService.encryptDomainFields(account.tempUsername ,secretKey)
        account.password = cryptographicService.encryptDomainFields(account.tempPassword ,secretKey)
        account.setDefaultProperties()
        def result = validateAndSave(account)
        if(result.success){
            emailService.sendNewAccountCreatedEmail(DEFAULT_EMAIL,account)
        }
        return result
    }

    def deleteAccount(Long accountId,String secretKey){
        Account account=Account.findById(accountId)
        def statusFlag=false
        if(account){
            account.tempUsername = cryptographicService.decryptDomainFields(account.username ,secretKey)
            account.delete()
            emailService.sendAccountDeleteEmail(DEFAULT_EMAIL,account)
            statusFlag=true
        }
        return statusFlag
    }

    def updateAccount(){

    }

    def viewAccount(Long accountId, secretKey){
        Account account= Account.findById(accountId)
        if(account){
            account.tempUsername=cryptographicService.decryptDomainFields(account.username,secretKey)
            account.password=cryptographicService.decryptDomainFields(account.password,secretKey)
        }
        return account
    }

    @CompileStatic
    def getListOfUsernames(input){
        def grailsCriteria = Account.createCriteria()
        def listOfUserNames = grailsCriteria.list {
            like ('accountName', 'input%')
        }
        return listOfUserNames
    }

    @CompileStatic
    def decryptAccountObj(Account accountObj, String secretKey){
        accountObj.tempUsername = cryptographicService.decryptDomainFields(accountObj.username ,secretKey)
        accountObj.tempPassword= cryptographicService.decryptDomainFields(accountObj.password , secretKey)
        return accountObj
    }
}
