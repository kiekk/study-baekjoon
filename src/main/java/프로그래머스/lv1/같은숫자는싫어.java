package 프로그래머스.lv1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (temp != arr[i]) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
