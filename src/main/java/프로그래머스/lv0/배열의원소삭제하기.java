package 프로그래머스.lv0;

import java.util.List;
import java.util.stream.IntStream;

public class 배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        List<Integer> list = IntStream.of(arr)
                .boxed()
                .toList();

        for (int i = 0; i < delete_list.length; i++) {
            if (list.contains(delete_list[i])) {
                list.remove(list.indexOf(delete_list[i]));
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
