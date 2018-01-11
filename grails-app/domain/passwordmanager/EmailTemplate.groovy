package passwordmanager

class EmailTemplate {

    String name
    String body
    String subject
    boolean isActive

    public static String ACCOUNT_CREATED ='createAccount'
    public static String ACCOUNT_DELETED ='deleteAccount'
    static constraints = {
        body sqlType: 'text'
    }
}
