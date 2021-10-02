package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BallsTest {

    Balls balls = new Balls(Arrays.asList(1, 2, 3));

    @Test
    void balls_nothing() {
        PlayResult playResult = balls.play(Arrays.asList(4, 5, 6));

        assertEquals(0, playResult.getStrike());
        assertEquals(0, playResult.getBall());
        assertTrue(playResult.isNothing());
    }

    @Test
    void one_ball_one_strike() {
        PlayResult playResult = balls.play(Arrays.asList(1, 5, 2));

        assertEquals(1, playResult.getStrike());
        assertEquals(1, playResult.getBall());
    }

    @Test
    void three_strike_end_game() {
        PlayResult playResult = balls.play(Arrays.asList(1, 2, 3));

        assertEquals(3, playResult.getStrike());
        assertEquals(0, playResult.getBall());
        assertTrue(playResult.isPlayOver());
    }
}
