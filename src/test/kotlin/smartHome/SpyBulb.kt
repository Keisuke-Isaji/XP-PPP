package smartHome

class SpyBulb {
    var spyBulbTurnOnWasCalled = false
    var spyBulbTurnOffWasCalled = false

    fun alwaysOnSwicthIsOn() {
        spyBulbTurnOnWasCalled = true
    }

    fun alwaysOffSwicthIsOn() {
        spyBulbTurnOffWasCalled = true
    }
}
