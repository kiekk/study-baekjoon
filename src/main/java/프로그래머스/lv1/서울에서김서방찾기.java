package 프로그래머스.lv1;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        int index = Arrays.asList(seoul)
                .indexOf("Kim");

        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}
