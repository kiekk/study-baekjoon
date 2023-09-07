package 프로그래머스.lv0;

import java.util.Arrays;

public class 배열에서문자열대소문자변환하기 {
    public String[] solution(String[] strArr) {
        String[] answer = Arrays.copyOf(strArr, strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = answer[i].toLowerCase();
            } else {
                answer[i] = answer[i].toUpperCase();
            }
        }
        return answer;
    }
}
