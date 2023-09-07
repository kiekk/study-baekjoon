package 프로그래머스.lv0;

import java.util.Arrays;

public class 배열조각하기 {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 배열조각하기().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{5, 2}));
    }
}
