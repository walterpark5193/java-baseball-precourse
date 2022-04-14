package baseball;

public class CompareAnswer {

    public static final int ANSWER_COUNT = 3;
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";
    public static final String NOTHING = "낫싱";
    public static final String BLANK = " ";

    public String countAnswer(int containCnt, int strikeCnt) {
        String msg = "";
        int ballCnt = containCnt - strikeCnt;
        if(ballCnt>0) {
            msg+=ballCnt + BALL;
        }
        if(!msg.isEmpty()) msg += BLANK;
        if(strikeCnt>0) {
            msg+=strikeCnt + STRIKE;
        }
        if(msg.isEmpty()) msg = NOTHING;
        return msg;
    }

    public void printAnswer(int strikeCnt, String answerMsg) {
        System.out.println(answerMsg);
        if(checkAnswer(strikeCnt)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }

    public boolean checkAnswer(int strikeCnt) {
       return strikeCnt == ANSWER_COUNT;
    }
}