package 프로그래머스.lv0;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class 정수찾기 {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        OptionalInt findNum = IntStream.of(num_list)
                .filter(num -> num == n)
                .findFirst();

        answer = findNum.isPresent() ? 1 : 0;
        return answer;
    }
}
