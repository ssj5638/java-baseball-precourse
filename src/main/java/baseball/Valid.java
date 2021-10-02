package baseball;

public class Valid {

    public static boolean lengthCheck(String strBalls) {
        if (strBalls.length() != 3) {
            return false;
        }
        return true;
    }
}
