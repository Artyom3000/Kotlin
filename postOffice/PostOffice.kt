class PostOffice : Subscribe {
    private val mailsList: MutableList<Mail?>
    override fun receiveMail(mail: Mail?) {
        mailsList.add(mail)
    }

    fun readAllMails() {
        for (mail in mailsList) {
            mail!!.readLetter()
        }
    }

    init {
        mailsList = ArrayList()
    }
}