package 프로그래머스.lv1;

import java.util.stream.LongStream;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            answer = LongStream.rangeClosed(b, a).sum();
        } else if (b > a) {
            answer = LongStream.rangeClosed(a, b).sum();
        } else {
            answer = a;
        }
        return answer;
    }
}
