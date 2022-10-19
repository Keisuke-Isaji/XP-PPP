package smartHome

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SmartHomeTest {
    // STEP1
    // テスト:Tono
    // 実装:Misaki

    @Test
    fun `スイッチONの状態の時は、バルブがONになる`() {
        // ARRANGE
        // バルブ(光る・光らない)の ON/OFF操作を のぞき見するSpyのインスタンスを生成
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

    }

    @Test
    fun `スイッチONを5回実行したら、スマートホームの電球切れ警告する`() {

    }
}