package baseball;

import java.util.List;

public class Valid {

    public static boolean lengthCheck(String strBalls) {
        if (strBalls.length() != 3) {
            return false;
        }
        return true;
    }

    public static boolean numberValid(int ball) {
        if (ball < 1 || ball > 9) {
            return false;
        }
        return true;
    }

    public static boolean duplicateValid(List<Integer> ballList) {
        if(ballList.size() != ballList.stream().distinct().count()){
            return false;
        }
        return true;
    }
}
