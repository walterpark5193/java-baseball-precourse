package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class GenerateNumber {

    public List<Integer> generateNumberInRange(List<Integer> answer) {
        answer.clear();
        //1. 랜덤 3자리 숫자 생성 기능
        while(answer.size()<3){
            answer = makeAnswerList(answer);
        }
        System.out.println("answer = "+answer.toString());
        /* pickUniqueNumbersInRange 테스트시 사용할 로직
        answer = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        */
        return answer;
    }

    public List<Integer> makeAnswerList(List<Integer>answer){
        int num = Randoms.pickNumberInRange(1, 9);
        if(!answer.contains(num)) answer.add(num);
        return answer;
    }

}
