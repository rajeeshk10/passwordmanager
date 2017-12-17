package passwordmanager

class LoginController {

static defaultAction = "index"

    def index() {
      render (view : "login")
     }

     def validateCredentials(){
     //these values also u can save as encrypted text. and while entering the key . decrypt and validate.
       def username = grailsApplication.config.getProperty('info.app.username')
       def password = grailsApplication.config.getProperty('info.app.password')
       render(view : "login")
     }


     def setUserInSession(){

     }

     def removeUserFromSession(){

     }

     def validateUserSession(){

     }


     def getUserInfo(){

     }


    def changeTheSecretKey(){
        //Rightnow will go with this approach, thiw will encrypt all username pasword again.
    }

}
