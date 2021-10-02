package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    Ball ball = new Ball(0, 1);

    @Test
    void 볼_낫싱() {
        assertEquals(BallStatus.NOTHING, ball.play(new Ball(0, 2)));
    }

    @Test
    void 볼_스트라이크() {
        assertEquals(BallStatus.STRIKE, ball.play(new Ball(0, 1)));
    }

    @Test
    void 볼_볼() {
        assertEquals(BallStatus.BALL, ball.play(new Ball(1, 1)));
    }
}