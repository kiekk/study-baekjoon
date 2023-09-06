package 프로그래머스.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        Map<String, Integer> countMap = new HashMap<>();
        Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .forEach(value -> countMap.put(value, countMap.getOrDefault(value, 0) + 1));

        answer = countMap.getOrDefault("p", 0) == countMap.getOrDefault("y", 0);

        return answer;
    }
}
