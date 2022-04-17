package baseball.domain;

import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Console;

public class ManageUserInput {

    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 9;
    public static final String REPLAY_Y = "1";
    public static final String REPLAY_N = "2";

    public String readInput(){
        String input = InputView.getInput();
        inputValidation(input);     //사용자 입력값 밸리데이션
        return input;
    }

    public String readReplayInput(){
        String input = InputView.getReplayInput();
        replayInputValidation(input);     //사용자 입력값 밸리데이션
        return input;
    }

    public void inputValidation(String input){
        checkEmpty(input);  //공백 체크
        checkLength(input); //입력 길이 체크
        checkRange(input);  //입력 값 범위 체크
    }

    public void replayInputValidation(String input){
        checkEmpty(input);  //공백 체크
        checkReplayLength(input); //입력 길이 체크
        checkReplayValue(input);  //입력 값 체크
    }

    public void checkEmpty(String input) {
        if(input.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public void checkLength(String input){
        if(input.length()!=3) {
            throw new IllegalArgumentException();
        }
    }

    public void checkReplayLength(String input){
        if(input.length()!=1) {
            throw new IllegalArgumentException();
        }
    }

    public void checkRange(String input) {
        int inputNum = Integer.parseInt(input);
        if(inputNum < MIN_VALUE || inputNum > MAX_VALUE){
            throw new IllegalArgumentException();
        }
    }

    public void checkReplayValue(String input) {
        String value = String.valueOf(input.charAt(0));
        if(!(REPLAY_Y.equals(value) || REPLAY_N.equals(value))){
            throw new IllegalArgumentException();
        }
    }
}
