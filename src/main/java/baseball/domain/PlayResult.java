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
}
