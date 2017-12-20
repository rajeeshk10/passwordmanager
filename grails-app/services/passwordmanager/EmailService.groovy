
package passwordmanager

class EmailService{

    def send(params) {
        sendMail {
            to params.address
            subject params.subject
            text params.body
        }

      // flash.message = "Message sent at "+new Date()
      // redirect action:"index"

    }
}
