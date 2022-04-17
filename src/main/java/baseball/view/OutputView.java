package baseball.view;

public class OutputView {

    public static final int ANSWER_COUNT = 3;
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";
    public static final String NOTHING = "낫싱";
    public static final String BLANK = " ";
    public static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static void printCountAnswerMessage(int containCnt, int strikeCnt) {
        String msg = "";
        if(containCnt - strikeCnt > 0) {
            msg+=containCnt - strikeCnt + BALL + BLANK; //볼 갯수 카운트 확인 및 메시지 조합
        }

        if(strikeCnt>0) {
            msg+=strikeCnt + STRIKE;
        }

        if(msg.isEmpty()){
            msg = NOTHING;
        }

        System.out.println(msg);
    }

    public static void printAnswer(int strikeCnt) {
        if(strikeCnt == ANSWER_COUNT) {
            System.out.println(END_MESSAGE);
        }
    }

}
