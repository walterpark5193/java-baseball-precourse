package baseball;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //0. 변수 선언
        ManageGame manageGame = new ManageGame();

        do {
            //서비스 호출
            manageGame.playGame();

            //7. 정답을 맞춘 뒤 새로 시작하거나 종료하는 기능
        } while(manageGame.replayYN());
    }
}
