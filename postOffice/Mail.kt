class Mail internal constructor(private val letter: String) {
    fun readLetter() {
        System.out.printf("You've got mail: %s%n", letter)
    }
}