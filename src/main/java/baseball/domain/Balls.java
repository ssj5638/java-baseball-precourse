package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> comBalls;

    public Balls(List<Integer> ballList) {
        this.comBalls = ballMap(ballList);
    }

    private List<Ball> ballMap(List<Integer> ballList) {
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
        List<Ball> userBalls = ballMap(ballList);
        for (Ball comball : comBalls) {
            for (Ball userBall : userBalls) {
                playResult.report(comball.play(userBall));
            }
        }

        return playResult;
    }
}
