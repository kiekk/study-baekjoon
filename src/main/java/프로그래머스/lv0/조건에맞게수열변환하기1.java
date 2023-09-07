package 프로그래머스.lv0;

import java.util.stream.IntStream;

public class 조건에맞게수열변환하기1 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        answer = IntStream.of(arr)
                .boxed()
                .mapToInt(value -> {
                    if (value >= 50 && value % 2 == 0) {
                        return value / 2;
                    }
                    if (value < 50 && value % 2 == 1) {
                        return value * 2;
                    }
                    return value;
                })
                .toArray();

        return answer;
    }
}
