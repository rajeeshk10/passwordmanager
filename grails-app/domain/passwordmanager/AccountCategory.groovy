package passwordmanager

class AccountCategory {

  String category

  static hasMany = [accountType : AccountType]

    static constraints = {
      accountType nullable: true
    }
}
