package device

import device.InputTextListener

class TextEditor internal constructor() : InputTextListener {
    private val inputStringBuilder: StringBuilder
    override fun onTextChanged(input: String?) {
        inputStringBuilder.append(input)
    }

    override fun getInputString(): String {
        return inputStringBuilder.toString()
    }

    init {
        inputStringBuilder = StringBuilder()
    }
}