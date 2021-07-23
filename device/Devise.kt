import device.Button
import device.TextEditor
import java.util.*

class Device internal constructor() {
    private val button: Button
    private val textEditor: TextEditor
    fun clickOnButton() {
        button.onClickListener()
    }

    fun enterText() {
        val `in` = Scanner(System.`in`)
        val inputText = `in`.nextLine()
        textEditor.onTextChanged(inputText)
    }

    fun readInputText() {
        val text: String = textEditor.getInputString()
        if (text != null) {
            println(text)
        }
    }

    init {
        button = Button()
        textEditor = TextEditor()
    }
}