package smartHome

class SpyBulb : Switchable {
    var bulbOutWarning: Boolean = false
    var turnOnWasCalled: Boolean = false
    var turnOffWasCalled: Boolean = false

    override fun turnOn() {
        turnOnWasCalled = true
    }

    override fun turnOff() {
        turnOffWasCalled = true
    }
}