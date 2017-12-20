package passwordmanager


class Account {

  String username
  String password
  AccountType accountType
  String accountName

  def cryptographicService

    static constraints = {
    }


  def beforeValidate(){
    this.username = cryptographicService.encryptDomainFields(this.username)
    this.password = cryptographicService.encryptDomainFields(this.password)
  }
}
