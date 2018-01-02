package passwordmanager

import grails.gorm.transactions.Transactional


@Transactional
class HomeService {

    def cryptographicService

    def serviceMethod() {

    }


    def validateAndSave(Account account){
        if(!account.save()){
            account.errors.allErrors.each{
                println it
            }
        }
    }


    def saveAccount(){

    }

    def deleteAccount(){

    }

    def updateAccount(){

    }

    def viewAccount(){

    }


    def getListOfUsernames(input){
        def grailsCriteria = Account.createCriteria()
        def listOfUserNames = grailsCriteria.list {
//            projections {
//                property('username')
//            }
            like ('accountName', 'input%')
        }
//        def listOfUserNames=Account.list()
        return listOfUserNames
    }


    def decryptAccountObj(Account accountObj){
        accountObj.tempUsername = cryptographicService.decryptDomainFields(accountObj.username)
        accountObj.tempPassword= cryptographicService.decryptDomainFields(accountObj.password)
        return accountObj
    }
}
