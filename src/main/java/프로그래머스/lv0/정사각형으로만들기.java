package 프로그래머스.lv0;

public class 정사각형으로만들기 {
    public int[][] solution(int[][] arr) {
        int maxLength = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[maxLength][maxLength];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
        return answer;
    }
}
