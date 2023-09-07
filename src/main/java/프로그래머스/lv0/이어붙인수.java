package 프로그래머스.lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 이어붙인수 {
    public int solution(int[] num_list) {
        int answer = 0;

        int even = Integer.parseInt(IntStream.of(num_list)
                .filter(num -> num % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));

        int odd = Integer.parseInt(IntStream.of(num_list)
                .filter(num -> num % 2 == 1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));

        answer = even + odd;
        return answer;
    }
}
