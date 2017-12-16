package passwordmanager

class LoginController {

static defaultAction = "index"

    def index() {
      render (view : "login")
     }

     def validateCredentials(){
       def username = grailsApplication.config.getProperty('info.app.username')
       def password = grailsApplication.config.getProperty('info.app.password')
       println 'username - '+username + ' - password - '+password
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

}
