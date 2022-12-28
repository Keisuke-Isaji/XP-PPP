package smartHome

class SpyBulb {
    var bulbWarning = false
    var bulbOnCount = 0
    var bulbOffCount = 0
    var spyBulbTurnOnWasCalled = false
    var spyBulbTurnOffWasCalled = false

    fun alwaysOnSwicthIsOn() {
        spyBulbTurnOnWasCalled = true
        bulbOnCount += 1
    }

    fun alwaysOffSwicthIsOn() {
        spyBulbTurnOffWasCalled = true
        bulbOffCount += 1
        if (bulbOffCount >= 50000 && bulbOnCount >= 50000) {
            bulbWarning = true
        }
    }
}
