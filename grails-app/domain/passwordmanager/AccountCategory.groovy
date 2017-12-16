package passwordmanager

class AccountCategory {

  String category

  static  belongsTo =[accountType : AccountType]

    static constraints = {
    }
}
