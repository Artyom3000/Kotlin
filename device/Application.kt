package device

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        val user = User()
        user.deviceClick()
        user.deviceEnterText()
        user.deviceEnterText()
        user.devicePrintText()
    }
}