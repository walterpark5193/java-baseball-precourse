package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //1. 랜덤 3자리 숫자 생성 기능
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);

        //2. 사용자 정답값 입력 받는 기능
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        //3. 입력된 숫자가 정답에 존재하는지 체크하는 기능


        //4. 같은 자릿수에 동일한 숫자가 존재하는지 체크하는 기능


        //5. 스트라이크, 볼 카운트 체크하는 기능


        //6. 정답을 맞췄을 시 새로 시작하거나 종료하는 기능


    }
}
