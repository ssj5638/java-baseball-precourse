package baseball.domain;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return strike;
    }

    public void setStrike() {
        ++this.strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall() {
        ++this.ball;
    }

    public boolean isNothing() {
        return ball == 0 && strike == 0;
    }

    public boolean isPlayOver() {
        return strike == 3;
    }
}
