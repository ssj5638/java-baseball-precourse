package baseball.domain;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isNothing() {
        return ball == 0 && strike == 0;
    }

    public boolean isPlayOver() {
        return strike == 3;
    }

    public void report(BallStatus ballStatus) {
        if (ballStatus == BallStatus.BALL) {
            ball++;
        }
        if (ballStatus == BallStatus.STRIKE) {
            strike++;
        }
    }
}
