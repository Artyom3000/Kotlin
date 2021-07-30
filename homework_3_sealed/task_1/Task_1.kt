package homework_3_sealed.task_1

import homework_3.task_1.Client
import homework_3.task_1.Mailer

private val Any.email: Nothing?
    get() {
        TODO("Not yet implemented")
    }

sealed class Task_1<sendMessageToClient> {
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

