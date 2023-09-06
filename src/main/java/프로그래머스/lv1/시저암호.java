package 프로그래머스.lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 시저암호 {
    public String solution(String s, int n) {
        return s.chars()
                .map(character -> {
                    if (Character.isUpperCase(character)) {
                        return character + n > 'Z' ? character + n - 26 : character + n;
                    }

                    if (Character.isLowerCase(character)) {
                        return character + n > 'z' ? character + n - 26 : character + n;
                    }

                    return character;
                })
                .mapToObj(character -> String.valueOf((char) character))
                .collect(Collectors.joining());
    }
}
