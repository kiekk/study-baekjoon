package 프로그래머스.lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        answer = Arrays.stream(commands)
                .mapToInt(arrays -> {
                    int startIndex = arrays[0] - 1;
                    int endIndex = arrays[1];
                    int point = arrays[2];

                    return Arrays.stream(Arrays.copyOfRange(array, startIndex, endIndex))
                            .sorted()
                            .toArray()[point - 1];
                })
                .toArray();
        return answer;
    }
}
