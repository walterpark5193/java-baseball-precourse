package baseball;

import camp.nextstep.edu.missionutils.Console;

public class ManageGame {
    public boolean replayYN(int strikeCnt) {
        if(!new CheckAnswer().checkAnswer(strikeCnt)) {
            return false;
        }
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        if(input.isEmpty()){
            return true;
        }
        return input.charAt(0) == '1';
    }
}
