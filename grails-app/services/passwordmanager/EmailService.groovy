
package passwordmanager

import groovy.text.SimpleTemplateEngine
import org.hibernate.validator.constraints.Email

class EmailService{

    private def send(EmailContent emailContent) {
       try{
           sendMail {
               to emailContent.address
               subject emailContent.subject
               html emailContent.body
           }
       }catch (Exception ex){
            println ex
       }
    }

    def generateEmailContent(Account account,EmailTemplate emailTemplate,EmailContent emailContent){
        def binding = [Account : account]
        def engine = new SimpleTemplateEngine()
        emailContent.subject= engine.createTemplate(emailTemplate.subject).make(binding).toString()
        emailContent.body= engine.createTemplate(emailTemplate.body).make(binding).toString()
        return  emailContent
    }




    def sendNewAccountCreatedEmail(String toAdress, Account account){
        EmailContent emailContent=new EmailContent(address: toAdress)
        EmailTemplate emailTemplate=EmailTemplate.findByName(EmailTemplate.ACCOUNT_CREATED)
        generateEmailContent(account,emailTemplate,emailContent)
        send(emailContent)
    }

    def sendErrorEmail(){

    }

    def sendAccountUpdateEmail(){

    }

    def sendAccountDeleteEmail(String toAdress, Account account){
        EmailContent emailContent=new EmailContent(address: toAdress)
        EmailTemplate emailTemplate=EmailTemplate.findByName(EmailTemplate.ACCOUNT_DELETED)
        generateEmailContent(account,emailTemplate,emailContent)
        send(emailContent)
    }

}
