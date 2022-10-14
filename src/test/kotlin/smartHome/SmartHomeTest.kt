package smartHome

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SmartHomeTest {
    // STEP1
    // テスト:Tono
    // 実装:Misaki

    @Test
    fun `スイッチONの状態の時は、バルブがONになる`() {
        // ARRANGE
        // バルブ(光る・光らない)の ON/OFF操作を のぞき見するSpy
        val spyBulb = SpyBulb()

        // テストが実施できるように、常にONになる スイッチのスタブを作る
        val stubSwitch = AlwaysOnSwitch()

        // ACTION:スイッチを入れる
        SmartHome(spyBulb, stubSwitch).run()

        // ASSERT
        // バルブONする。OFFはしない
        assertTrue(spyBulb.turnOnWasCalled)
    }

    @Test
    fun `スイッチOFFの時は、バルブがOFFになる`() {
        // ARRANGE
        // バルブの状態を監視するスパイを作る(上と同じ)
        val spyBulb = SpyBulb()

        // テストが実施できるように、常にOFFになる スイッチのスタブを作る
        val stubSwitch = AlwaysOffSwitch()

        // ACTION:スイッチを入れる
        SmartHome(spyBulb, stubSwitch).run()

        // ASSERT
        // バルブONしないで、OFFだけする
        assertFalse(spyBulb.turnOnWasCalled)
        assertTrue(spyBulb.turnOffWasCalled)
    }

    @Test
    fun `スイッチONを5回実行したら、スマートホームの電球切れ警告する`() {
        val spyBulb = SpyBulb()

        val stubSwitch = AlwaysOnSwitch()


        SmartHome(spyBulb, stubSwitch).run()
        SmartHome(spyBulb, stubSwitch).run()
        SmartHome(spyBulb, stubSwitch).run()
        SmartHome(spyBulb, stubSwitch).run()

        assertFalse(spyBulb.bulbOutWarning)


        SmartHome(spyBulb, stubSwitch).run()


        assertTrue(spyBulb.bulbOutWarning)

    }
}