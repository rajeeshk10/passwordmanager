package passwordmanager

import grails.gorm.transactions.Transactional

@Transactional
class HomeService {

    def serviceMethod() {

    }


    def validateAndSave(Account account){
        if(!account.save()){
            account.errors.allErrors.each{

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


}
