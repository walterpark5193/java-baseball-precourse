package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //0. 변수 선언
        List<Integer> answer;   //정답값 저장 변수
        String input;           //사용자 입력 값
        int containCnt;     //정답에 존재하는 숫자 갯수
        int strikeCnt;      //스트라이크 갯수
        //String answerMsg = "";  //정답 메시지
        CompareNumber compareNumber = new CompareNumber();
        CheckAnswer checkAnswer = new CheckAnswer();
        ManageGame manageGame = new ManageGame();
        boolean reGameYn = true;    //게임 재시작 확인 변수

        while (reGameYn) {
            //1. 랜덤 3자리 숫자 생성 기능
            strikeCnt = 0;
            answer = Randoms.pickUniqueNumbersInRange(1, 9, 3);
            System.out.println("answer = " + answer.toString());

            while (!checkAnswer.checkAnswer(strikeCnt)) {
                //2. 사용자 정답값 입력 받는 기능
                System.out.print("숫자를 입력해주세요 : ");
                input = Console.readLine();
                System.out.println("input = " + input);

                //3. 입력된 숫자가 정답에 존재하는지 체크하는 기능
        /*for (Integer integer : answer) {
            containCnt = compareNumber.checkNumber(input, integer.toString(), containCnt);
        }*/
                containCnt = compareNumber.countBallNumber(input, answer);
                System.out.println("containCnt = " + containCnt);

                //4. 같은 자릿수에 동일한 숫자가 존재하는지 체크하는 기능
        /*for(int i=0; i<answer.size(); i++) {
            strikeCnt = compareNumber.checkStrike(answer.get(i), Integer.parseInt(String.valueOf(input.charAt(i))), strikeCnt);
        }*/
                strikeCnt = compareNumber.countStrikeNumber(input, answer);
                System.out.println("strikeCnt = " + strikeCnt);

                //5. 스트라이크, 볼 카운트 체크하는 기능
                checkAnswer.countAnswer(containCnt, strikeCnt);

                //6. 정답 메시지 출력하는 기능
                checkAnswer.printAnswer(strikeCnt);
            }

            //7. 정답을 맞췄을 시 새로 시작하거나 종료하는 기능
            reGameYn = manageGame.replayYN(strikeCnt);
        }
    }
}
