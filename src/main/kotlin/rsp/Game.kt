package rsp

class Game {
    fun play(p1: Throw, p2: Throw): GameResult {
        if (p1 == Throw.ROCK) {
            if (p2 == Throw.SCISSORS)
                return GameResult.P1_WINS
            else if (p2 == Throw.PAPER) {
                return GameResult.P2_WINS
            }
        }

        if (p1 == Throw.SCISSORS) {
            if (p2 == Throw.PAPER)
                return GameResult.P1_WINS
            else if (p2 == Throw.ROCK) {
                return GameResult.P2_WINS
            }
        }

        if (p1 == Throw.PAPER) {
            if (p2 == Throw.ROCK)
                return GameResult.P1_WINS
            else if (p2 == Throw.SCISSORS) {
                return GameResult.P2_WINS
            }
        }

        return GameResult.TIE
    }
}
