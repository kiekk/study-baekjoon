package 프로그래머스.lv1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}
