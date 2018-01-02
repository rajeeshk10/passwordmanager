package passwordmanager

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def serviceMethod(genericObject) {

    }


    def validateAndSaveAccountType(AccountType accountType){
      accountType.typeValue=accountType.typeName
      accountType.save(flush : true)
    }

    def saveUserProfile(){

    }

    def deleteUserProfiles(){

    }



}
