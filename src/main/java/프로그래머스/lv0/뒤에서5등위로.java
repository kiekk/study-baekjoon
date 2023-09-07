package 프로그래머스.lv0;

import java.util.stream.IntStream;

public class 뒤에서5등위로 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = IntStream.of(num_list)
                .boxed()
                .mapToInt(num -> num)
                .sorted()
                .skip(5)
                .toArray();
        return answer;
    }
}
