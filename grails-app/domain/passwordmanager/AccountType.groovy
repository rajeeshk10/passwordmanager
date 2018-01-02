package passwordmanager

class AccountType {

  String typeName
  String typeValue 

  static hasOne = [accountCategory : AccountCategory]

    static constraints = {
    }
}
