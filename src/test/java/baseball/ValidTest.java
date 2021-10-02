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
}
