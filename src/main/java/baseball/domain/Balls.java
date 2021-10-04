package baseball.domain;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> comBalls;

    public Balls() {
        this.comBalls = makeComBall();
    }

    private List<Ball> makeComBall() {
        List<Ball> comBalls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            comBalls.add(new Ball(i, Randoms.pickNumberInRange(1, 9)));
        }
        return comBalls;
    }

    private List<Ball> ballList(List<Integer> ballList) {
        List<Ball> ballMap = new ArrayList<>();
        Ball ball;
        for (int i = 0; i < ballList.size(); i++) {
            ball = new Ball(i, ballList.get(i));
            ballMap.add(ball);
        }
        return ballMap;
    }

    // TODO : indent depth 줄이기
    public PlayResult play(List<Integer> ballList) {
        PlayResult playResult = new PlayResult();
        List<Ball> userBalls = ballList(ballList);
        for (Ball comball : comBalls) {
            for (Ball userBall : userBalls) {
                playResult.report(comball.play(userBall));
            }
        }

        return playResult;
    }
}
