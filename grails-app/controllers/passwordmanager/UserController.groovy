package passwordmanager

import groovy.transform.CompileStatic

class UserController {

    UserService userService

    def index() { }


    def createUserProfile(){

    }

    def deleteUserProfiles(){

    }

    @CompileStatic
    def registerAccountTypes(){
        return [accountType : new AccountType()]
    }


    def saveAccountTypes(){
        AccountType accountTypeInstance = new AccountType(params.accountType)
        userService.validateAndSaveAccountType(accountTypeInstance)
        render (view :'success')
    }

    def listAccountTypes(){
        //method to pull out list of account types before registring
        render (view : 'success')
    }

}
