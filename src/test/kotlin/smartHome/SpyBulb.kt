package smartHome

class SpyBulb : Switchable {
    var turnOnWasCalled: Boolean = false

    override fun turnOn() {
        turnOnWasCalled = true
    }
}