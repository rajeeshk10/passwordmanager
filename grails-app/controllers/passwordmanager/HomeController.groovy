package passwordmanager

class HomeController {

    HomeService homeService

    /*
    *
    * whenever doing any operation with user/paswd immediatedly email should be triggered.
    * set flag for email sent or not, date field also
    * user/paswd details updated date also .. all this should sync together.
    * */

    def index() {

        render ( view : "index")
    }


    def saveAccount(){

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



}

