package 프로그래머스.lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 시저암호 {
    public String solution(String s, int n) {
        String answer = Arrays.stream(s.split(""))
                .map(spelling -> {
                    char ascii = spelling.charAt(0);

                    if (ascii >= 65 && ascii <= 90) {
                        return ascii + n > 90 ? String.valueOf((char) (ascii + n - 26)) : String.valueOf((char) (ascii + n));
                    }

                    if (ascii >= 97 && ascii <= 122) {
                        return ascii + n > 122 ? String.valueOf((char) (ascii + n - 26)) : String.valueOf((char) (ascii + n));
                    }

                    return " ";
                })
                .collect(Collectors.joining());
        return answer;
    }
}
