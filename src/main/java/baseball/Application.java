package baseball;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //0. 변수 선언
        List<Integer> answer = new ArrayList<>();   //정답값 저장 변수
        int strikeCnt;      //스트라이크 갯수
        ManageGame manageGame = new ManageGame();
        GenerateNumber generateNumber = new GenerateNumber();
        int num;

        do {
            //1. 랜덤 3자리 숫자 생성 기능
            generateNumber.generateNumberInRange(answer);

            //2 ~ 6번 기능은 playGame에서 구현
            strikeCnt = manageGame.playGame(answer);
        } while(manageGame.replayYN(strikeCnt));    //7. 정답을 맞췄을 시 새로 시작하거나 종료하는 기능
    }
}
