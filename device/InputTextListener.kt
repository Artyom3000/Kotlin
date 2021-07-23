package device

interface InputTextListener {
    fun onTextChanged(input: String?)
    abstract fun getInputString(): String
}