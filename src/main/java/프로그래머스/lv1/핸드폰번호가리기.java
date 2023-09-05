package 프로그래머스.lv1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";

        String replaceNumber = phone_number.substring(0, phone_number.length() - 4);

        String asterisk = IntStream.range(0, phone_number.length() - 4)
                .mapToObj(value -> "*")
                .collect(Collectors.joining());
        answer = phone_number.replace(replaceNumber, asterisk);
        return answer;
    }
}
