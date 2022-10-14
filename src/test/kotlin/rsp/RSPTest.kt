package rsp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RSPTest {
    val game = Game()

    @Test
    fun `rock vs scissors = p1 wins`() {
        //action
        val result = game.play(Throw.ROCK, Throw.SCISSORS)


        //assert
        assertEquals(GameResult.P1_WINS, result)
    }

    @Test
    fun `scissors vs rock = p2 wins`() {
        //action
        val result = game.play(Throw.SCISSORS, Throw.ROCK)


        //assert
        assertEquals(GameResult.P2_WINS, result)
    }

    @Test
    fun `paper vs rock = p1 wins`() {
        //action
        val result = game.play(Throw.PAPER, Throw.ROCK)


        //assert
        assertEquals(GameResult.P1_WINS, result)
    }

    @Test
    fun `rock vs paper = p2 wins`() {
        //action
        val result = game.play(Throw.ROCK, Throw.PAPER)


        //assert
        assertEquals(GameResult.P2_WINS, result)
    }

    @Test
    fun `scissors vs paper = p1 wins`() {
        //action
        val result = game.play(Throw.SCISSORS, Throw.PAPER)


        //assert
        assertEquals(GameResult.P1_WINS, result)
    }
    @Test
    fun `paper vs scissors = p2 wins`() {
        //action
        val result = game.play(Throw.PAPER, Throw.SCISSORS)


        //assert
        assertEquals(GameResult.P2_WINS, result)
    }
    @Test
    fun `rock vs rock = tie!`() {
        //action
        val result = game.play(Throw.ROCK, Throw.ROCK)


        //assert
        assertEquals(GameResult.TIE, result)
    }
    @Test
    fun `scissors vs scissors = tie!`() {
        //action
        val result = game.play(Throw.SCISSORS, Throw.SCISSORS)


        //assert
        assertEquals(GameResult.TIE, result)
    }
    @Test
    fun `paper vs paper = tie!`() {
        //action
        val result = game.play(Throw.PAPER, Throw.PAPER)


        //assert
        assertEquals(GameResult.TIE, result)
    }
}