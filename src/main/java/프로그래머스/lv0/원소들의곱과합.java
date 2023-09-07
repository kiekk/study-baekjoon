package 프로그래머스.lv0;

import java.util.stream.IntStream;

public class 원소들의곱과합 {
    public int solution(int[] num_list) {
        int answer = 0;

        int multiply = IntStream.of(num_list)
                .boxed()
                .mapToInt(num -> num)
                .reduce(1, (num1, num2) -> num1 * num2);

        int sumPow = (int) Math.pow(IntStream.of(num_list)
                .boxed()
                .mapToInt(num -> num)
                .sum(), 2);
        answer = multiply < sumPow ? 1 : 0;
        return answer;
    }
}
