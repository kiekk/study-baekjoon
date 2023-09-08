package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 수열과구간쿼리2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];

            int[] array = Arrays.copyOfRange(arr, start, end + 1);

            answer[i] = IntStream.of(array)
                    .boxed()
                    .filter(num -> num > value)
                    .mapToInt(num -> num)
                    .min()
                    .orElse(-1);
        }
        return answer;
    }
}
