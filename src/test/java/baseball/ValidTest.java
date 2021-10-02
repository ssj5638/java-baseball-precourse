package baseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidTest {

    Valid valid = new Valid();

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
}
