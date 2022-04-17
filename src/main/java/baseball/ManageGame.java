package baseball;

import baseball.domain.CountNumber;
import baseball.domain.GenerateNumber;
import baseball.domain.ManageUserInput;
import baseball.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class ManageGame {

    public static final String REPLAY_Y = "1";

    public CountNumber countNumber;
    public GenerateNumber generateNumber;
    public ManageUserInput manageUserInput;
    List<Integer> answer;       //정답값 저장 변수;

    public ManageGame() {
        countNumber = new CountNumber();
        generateNumber = new GenerateNumber();
        manageUserInput = new ManageUserInput();
        answer = new ArrayList<>();   //정답값 저장 변수;
    }

    public void playGame() {
        String input;  //사용자 입력 값, 정답 메시지
        int containCnt;     //정답에 존재하는 숫자 갯수
        int strikeCnt;

        //1. 랜덤 3자리 숫자 생성 기능 구현
        generateNumber.generateNumberInRange(answer);

        do {
            //2. 사용자 정답값 입력 받는 기능
            input = manageUserInput.readInput();

            //3. 사용자 입력 값 중 정답에 존재하는 숫자 개수 체크하는 기능
            containCnt = countNumber.countBallNumber(input, answer);

            //4. 사용자 입력값과 정답값을 비교하여 같은 자리수에 존재하는 숫자 갯수 체크하는 기능
            strikeCnt = countNumber.countStrikeNumber(input, answer);

            //5. 스트라이크, 볼 카운트 체크해서 출력하는 기능
            OutputView.printCountAnswerMessage(containCnt, strikeCnt);

            //6. 정답 메시지 출력하는 기능
            OutputView.printAnswer(strikeCnt);
        } while (!countNumber.checkAnswer(strikeCnt));
    }

    public boolean replayYN() {
        String replayYn = manageUserInput.readReplayInput();
        return REPLAY_Y.equals(replayYn);
    }
}
