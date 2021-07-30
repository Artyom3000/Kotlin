package homework_3.task_1


private val Any.email: Nothing?
    get() {
        TODO("Not yet implemented")
    }

class Task_1<sendMessageToClient> {
    fun sendMessageToClient(
        client: Client?,
        message: String?,
        mailer: Mailer
    ) {
        if (client == null || message == null) return
        val personalInfo = Client.getPersonalInfo() ?: return
        val email = personalInfo.email ?: return
    }
}

