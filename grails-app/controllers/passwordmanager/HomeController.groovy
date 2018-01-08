package passwordmanager

import grails.converters.JSON

class HomeController {

    HomeService homeService

    /*
    *
    * whenever doing any operation with user/paswd immediatedly email should be triggered.
    * set flag for email sent or not, date field also
    * user/paswd details updated date also .. all this should sync together.
    * */

    def index() {
        render ( view : "create" ,model : [account : new Account() , accountTypeList : AccountType.list()])
    }


    def saveAccount(){
        def secretKey= params.secretKey
        Account account=new Account(params.account)
        def result = homeService.saveAccount(account,secretKey)
        if(result.success){
            redirect (action : "listAllAccounts" , params: [secretKey: secretKey])
        }
    }


    def viewAccount(){
        //here u can call decrypt and retrieve data
    }


    def deleteAccount(){

    }


    def updateAccount(){

    }

    def sendBackuptoEmail(){

    }

    def getListOfUserNames(){
        def listOfUserNames = homeService.getListOfUsernames(params.id)
        render listOfUserNames as JSON
    }


    def listAllAccounts(){
        def secretKey= params.secretKey
        List accountObjList = new ArrayList()
        Account.list().each{accountObj ->
            Account actObj=homeService.decryptAccountObj(accountObj,secretKey)
            accountObjList.add(actObj)
        }
        render (view : 'index' , model: [listOfAccounts : accountObjList])
    }

}

