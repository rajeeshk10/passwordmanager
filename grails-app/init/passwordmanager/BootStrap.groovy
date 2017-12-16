package passwordmanager

class BootStrap {

    def init = { servletContext ->

      // new AccountCategory(category : 'finance').save(flush: true)
      // new AccountCategory(category : 'social/email').save(flush : true)
      // new AccountCategory(category : 'otherLogins').save(flush : true)
        // println "account category list-- "+AccountCategory.list()
    }
    def destroy = {
    }
}
