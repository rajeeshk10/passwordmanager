package passwordmanager

import groovy.transform.CompileStatic

class UserController {

    def index() { }


    def createUserProfile(){

    }

    def deleteUserProfiles(){

    }

    @CompileStatic
    def registerAccountTypes(){
      return [accountType : new AccountType()]
    }

    @CompileStatic
    def saveAccountTypes(){
        AccountType accountTypeInstance = new AccountType(params)
    }

    def listAccountTypes(){
      //method to pull out list of account types before registring
    }

}
