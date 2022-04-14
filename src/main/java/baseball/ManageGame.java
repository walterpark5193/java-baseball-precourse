package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class ManageGame {
    public int playGame(List<Integer> answer) {
        String input;           //사용자 입력 값
        int containCnt;     //정답에 존재하는 숫자 갯수
        int strikeCnt;
        CountNumber countNumber = new CountNumber();
        CompareAnswer compareAnswer = new CompareAnswer();

        do {
            //2. 사용자 정답값 입력 받는 기능
            input = readInput();

            //3. 입력된 숫자가 정답에 존재하는지 체크하는 기능
            containCnt = countNumber.countBallNumber(input, answer);

            //4. 같은 자릿수에 동일한 숫자가 존재하는지 체크하는 기능
            strikeCnt = countNumber.countStrikeNumber(input, answer);

            //5. 스트라이크, 볼 카운트 체크하는 기능
            compareAnswer.countAnswer(containCnt, strikeCnt);

            //6. 정답 메시지 출력하는 기능
            compareAnswer.printAnswer(strikeCnt);

        } while (!compareAnswer.checkAnswer(strikeCnt));
        return strikeCnt;
    }

    public String readInput(){
        System.out.println("숫자를 입력해주세요 : ");
        return Console.readLine();
    }


    public boolean replayYN(int strikeCnt) {
        if(!new CompareAnswer().checkAnswer(strikeCnt)) {
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
