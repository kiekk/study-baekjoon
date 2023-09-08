package 프로그래머스.lv0;

import java.util.Arrays;

public class 정사각형으로만들기 {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int length = arr.length;

        for (int[] ar : arr) {
            length = Math.max(length, ar.length);
        }

        answer = new int[length][length];

        for (int i = 0; i < answer.length; i++) {

            if (i >= arr.length) {
                answer[i] = new int[length];
            } else {
                answer[i] = Arrays.copyOf(arr[i], length);
            }
        }

        return answer;
    }
}
