package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import static baseball.ValidationUtils.*;
import static nextstep.utils.Console.readLine;

public class BaseballGame {
    private Balls comBalls;
    private boolean isPlayOver;

    public BaseballGame() {
        init();
    }

    private void init() {
        isPlayOver = false;
        comBalls = new Balls();
    }

    public void run() {
        while (!isPlayOver) {
            System.out.print("숫자를 입력해 주세요 : ");
            playJudgment(readLine());
        }
        System.out.println("게임 끝");
        replay();
    }

    private void replay() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        if (readLine().equals("1")) {
            init();
            run();
        }
    }

    private void playJudgment(String strBalls) {
        if (!lengthValid(strBalls)) {
            System.out.println("1에서 9까지의 서로 다른 숫자 3개를 입력해 주세요.");
            return;
        }

        int ball;
        List<Integer> ballList = new ArrayList<>();
        for (int i = 0; i < strBalls.length(); i++) {
            ball = Integer.parseInt(strBalls.substring(i, i + 1));
            ballList.add(ball);
        }

        if (ballList.stream().anyMatch(num -> !numberValid(num))) {
            System.out.println("1에서 9까지의 서로 다른 숫자 3개를 입력해 주세요.");
            return;
        }

        if (!duplicateValid(ballList)) {
            System.out.println("1에서 9까지의 서로 다른 숫자 3개를 입력해 주세요.");
            return;
        }

        PlayResult playResult = comBalls.play(ballList);
        isPlayOver = playResult.isPlayOver();
        printJudgment(playResult);
    }

    private void printJudgment(PlayResult playResult) {
        if (playResult.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        if (playResult.getStrike() != 0)
            System.out.print(playResult.getStrike() + "스트라이크 ");
        if (playResult.getBall() != 0)
            System.out.print(playResult.getBall() + "볼");
        System.out.println();
    }
}
