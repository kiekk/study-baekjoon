package 프로그래머스.lv1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";

        answer = IntStream.range(0, (n / 2) * 2)
                .mapToObj(value -> "수박")
                .collect(Collectors.joining());

        if (n % 2 != 0) {
            answer += "수";
        }

        return answer;
    }
}
