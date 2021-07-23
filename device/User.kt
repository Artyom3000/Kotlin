package device

import Device

class User {
    private var device: Device? = null
    fun deviceClick() {
        checkDeviceExist()
        device!!.clickOnButton()
    }

    fun deviceEnterText() {
        checkDeviceExist()
        device!!.enterText()
    }

    fun devicePrintText() {
        checkDeviceExist()
        device!!.readInputText()
    }

    private fun checkDeviceExist() {
        if (device == null) {
            device = Device()
        }
    }
}