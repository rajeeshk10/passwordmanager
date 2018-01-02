package passwordmanager


class Account {

  def cryptographicService

  byte[] username
  byte[] password

  AccountType accountType
  String accountName

  String tempUsername
  String tempPassword

  static transients = ['tempUsername' , 'tempPassword']

  static constraints = {
    accountName nullable: true
  }

  static mapping = {
    autowire  true
  }

  def beforeValidate(){
    this.username = cryptographicService.encryptDomainFields(this.tempUsername)
    this.password = cryptographicService.encryptDomainFields(this.tempPassword)
  }
}
