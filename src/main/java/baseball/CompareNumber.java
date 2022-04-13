package baseball;

import java.util.List;

public class CompareNumber {
    public int countBallNumber(String userInput, List<Integer> answer) {
        int containCnt = 0;     //정답에 존재하는 숫자 갯수
        for (Integer integer : answer) {
            containCnt = checkNumber(userInput, integer.toString(), containCnt);
        }
        return containCnt;
    }

    public int checkNumber(String userInput, String answer, int cnt) {
        return userInput.contains(answer)?++cnt:cnt;
    }

    public int countStrikeNumber(String userInput, List<Integer> answer) {
        int strikeCnt = 0;     ////스트라이크 갯수
        for(int i=0; i<answer.size(); i++) {
            strikeCnt = checkStrike(answer.get(i), Integer.parseInt(String.valueOf(userInput.charAt(i))), strikeCnt);
        }
        return strikeCnt;
    }

    public int checkStrike(Integer answer, Integer userInput, int cnt) {
        return answer.equals(userInput)?++cnt:cnt;
    }
}
