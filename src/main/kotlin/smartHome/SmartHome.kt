package smartHome

class SmartHome(private val switchable: Switchable, private val switch: Switch) {
    fun run() {
        if (switch.isOn()) {
            switchable.turnOn()
        } else {
            switchable.turnOff()
        }
    }
}