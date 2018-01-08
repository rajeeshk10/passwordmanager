package passwordmanager


class Account {

//    def cryptographicService

    byte[] username
    byte[] password

    AccountType accountType
    String accountName
    Date lastUpdated
    boolean emailSentFlag


    String tempUsername
    String tempPassword

    static transients = ['tempUsername' , 'tempPassword']

    static constraints = {
        accountName nullable: true
    }

    static mapping = {
    }

    def setDefaultProperties(){
        this.lastUpdated = new Date()
        this.emailSentFlag = true
    }
}
