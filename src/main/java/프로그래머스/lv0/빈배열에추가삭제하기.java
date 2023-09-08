package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 빈배열에추가삭제하기 {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (flag[i]) {
                list.addAll(IntStream.range(0, value * 2)
                        .mapToObj(num -> value)
                        .collect(Collectors.toList()));
            } else {
                IntStream.range(0, value)
                        .boxed()
                        .forEach(num -> list.remove(list.size() - 1));
            }
        }

        answer = list.stream().mapToInt(num -> num).toArray();
        return answer;
    }
}
