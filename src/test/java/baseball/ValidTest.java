package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidTest {

    @Test
    void 입력_길이_체크() {
        assertTrue(Valid.lengthCheck("123"));
        assertFalse(Valid.lengthCheck("45"));
        assertFalse(Valid.lengthCheck("6789"));
    }

    @Test
    void 숫자_1과_9사이의_숫자_확인() {
        for (int i = 1; i < 10; i++) {
            assertTrue(Valid.numberValid(i));
        }
        assertFalse(Valid.numberValid(10));
        assertFalse(Valid.numberValid(-1));
        assertFalse(Valid.numberValid(0));
    }

    @Test
    void 중복_숫자_확인_true() {
        List<Integer> ballList = Arrays.asList(1, 2, 3);
        assertTrue(Valid.duplicateValid(ballList));
    }

    @Test
    void 중복_숫자_확인_false() {
        List<Integer> ballList = Arrays.asList(4, 4, 3);
        assertFalse(Valid.duplicateValid(ballList));
    }
}
