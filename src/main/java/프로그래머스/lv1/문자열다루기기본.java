package 프로그래머스.lv1;

import java.util.regex.Pattern;

public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;
        answer = Pattern.matches("[0-9]{4}|[0-9]{6}", s);
        return answer;
    }
}
