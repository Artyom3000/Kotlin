class MailSender {
    private val subscribers: MutableList<Subscribe>
    fun addSubscriber(subscribe: Subscribe) {
        subscribers.add(subscribe)
    }

    fun sendMail(mail: Mail?) {
        for (subscriber in subscribers) {
            subscriber.receiveMail(mail)
        }
    }

    init {
        subscribers = ArrayList<Subscribe>()
    }
}