package baseball;

public class CompareAnswer {

    public void countAnswer(int containCnt, int strikeCnt) {
        String msg = "";
        int ballCnt = containCnt - strikeCnt;
        if(ballCnt>0) {
            msg+=ballCnt+"볼";
        }
        if(!msg.isEmpty()) msg += " ";
        if(strikeCnt>0) {
            msg+=strikeCnt+"스트라이크";
        }
        if(msg.isEmpty()) msg = "낫싱";
        System.out.println(msg);
    }

    public void printAnswer(int strikeCnt) {
        if(checkAnswer(strikeCnt)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }

    public boolean checkAnswer(int strikeCnt) {
       return strikeCnt == 3;
    }
}