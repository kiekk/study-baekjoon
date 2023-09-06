package 프로그래머스.lv0;

import java.util.stream.IntStream;

public class 길이에따른연산 {
    public int solution(int[] num_list) {
        int answer = 0;

        IntStream numList = IntStream.of(num_list);
        if (num_list.length > 10) {
            answer = numList.sum();
        } else {
            answer = numList.reduce(1, (num1, num2) -> num1 * num2);
        }
        return answer;
    }
}
