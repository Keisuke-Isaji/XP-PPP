package smartHome

class SmartHome(private val switchable: Switchable, private val switch: Switch) {
    fun run() {
        switchable.turnOn()
    }
}