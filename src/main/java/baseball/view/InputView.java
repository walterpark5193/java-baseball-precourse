package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static final String INPUT_MSG = "숫자를 입력해주세요 : ";
    public static final String REPLAY_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String getInput() {
        System.out.print(INPUT_MSG);
        return Console.readLine();
    }

    public static String getReplayInput() {
        System.out.println(REPLAY_MSG);
        return Console.readLine();
    }
}
