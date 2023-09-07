package 프로그래머스.lv0;

import java.util.stream.Stream;

public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {
        String[] answer = {};
        answer = Stream.of(myString.trim().split("x"))
                .filter(str -> !str.isEmpty())
                .sorted()
                .toArray(String[]::new);
        return answer;
    }
}
