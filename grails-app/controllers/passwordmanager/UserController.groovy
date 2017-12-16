package passwordmanager

import groovy.transform.CompileStatic

class UserController {

    def index() { }


    def createUserProfile(){

    }

    def deleteUserProfiles(){

    }

    //method to Register different account types like , bank account, credit card,social , email ,
    // imt sorrentovalley etc.
    @CompileStatic
    def registerAccountTypes(){

      // render (view : 'registerAccountTypes', model : [accountType : new AccountType()])
      // [accountType : new AccountType() , accountCategoryList  :  AccountCategory.list()]
      return [accountType : new AccountType()]
    }

    @CompileStatic
    def saveAccountTypes(){

    }

    def listAccountTypes(){
      //method to pull out list of account types before registring
    }

}
