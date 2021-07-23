object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        val postOffice = PostOffice()
        val mailSender = MailSender()
        mailSender.addSubscriber(postOffice)
        val from = "John Doe"
        mailSender.sendMail(Mail("It's the first letter from: $from"))
        mailSender.sendMail(Mail("It's the second letter from: $from"))
        postOffice.readAllMails()
    }
}