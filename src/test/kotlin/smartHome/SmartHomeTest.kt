package smartHome

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SmartHomeTest {

    // STEP1
    // テスト：Tono
    // 実装：Misaki

    @Test
    fun `スイッチONの状態の時は、バルブがONになる`() {
        // ARRANGE
        // バルブの状態を監視するスパイを作る
        // テストが実施できるように、常にONになる スイッチのスタブを作る
        val spyBulb = SpyBulb()

        // ACTION：スイッチを入れる
        spyBulb.alwaysOnSwicthIsOn()

        // ASSERT
        // バルブONする。OFFはしない
        assertTrue(spyBulb.spyBulbTurnOnWasCalled)
    }

    @Test
    fun `スイッチOFFの時は、バルブがOFFになる`() {
        // ARRANGE
        // バルブの状態を監視するスパイを作る（上と同じ）
        // テストが実施できるように、常にOFFになる スイッチのスタブを作る
        val spyBulb = SpyBulb()


        // ACTION：スイッチを入れる
        spyBulb.alwaysOffSwicthIsOn()

        // ASSERT
        // バルブONしないで、OFFだけする
        assertTrue(spyBulb.spyBulbTurnOffWasCalled)
    }

//    STEP3: テスト→実装
//    3.スイッチONを5回実行したら、スマートホームの電球切れ警告する
//    要件①：「電球切れ予告」ステータス true/falseを スマートホームオブジェクトに持たせる
//    要件②：変数に実行回数を覚えておく、リポジトリを作る
//    　　　　サービス層があると美しいが、リポジトリ層だけでもOK。おまかせ。
//    @Test
//    fun `スイッチONを５回実行したら、スマートホームの電球切れ警告する`() {
//    //ARRANGE
//    val spyBulb = SpyBulb()
//
//    //ACTION
//    spyBulb.alwaysOnSwicthIsOn()
//    spyBulb.alwaysOnSwicthIsOn()
//    spyBulb.alwaysOnSwicthIsOn()
//    spyBulb.alwaysOnSwicthIsOn()
//
//    assertFalse(spyBulb.bulbWarning)
//    spyBulb.alwaysOnSwicthIsOn()
//
//    assertTrue(spyBulb.bulbWarning)
//    }

//    STEP4: テスト→実装
//    要件変更：スイッチONだけ5回で無く、OFF→ONの変更を5万回実行したらに。
    @Test
    fun `スイッチのONとOFFを５万回実行したら、スマートホームの電球切れ警告する`() {
    //ARRANGE
    val spyBuld = SpyBulb()

    fun bulbOnAndOFF() {
        spyBuld.alwaysOnSwicthIsOn()
        spyBuld.alwaysOffSwicthIsOn()
    }

    //ACTION
    for (i in 1..49999) {
        bulbOnAndOFF()
    }

    assertFalse(spyBuld.bulbWarning)

    bulbOnAndOFF()

    //ASSERT
    assertTrue(spyBuld.bulbWarning)
    }
}
