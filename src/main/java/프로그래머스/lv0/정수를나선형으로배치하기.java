package 프로그래머스.lv0;

public class 정수를나선형으로배치하기 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int i = 0;
        int j = -1;
        int k;
        int nLength = n;
        int nCounter = 0;
        int nOffset = 1;

        while (nCounter < n * n) {
            for (k = 0; k < (nLength * 2 - 1); ++k) {
                if (k < nLength) {
                    j += nOffset;
                } else {
                    i += nOffset;
                }

                answer[i][j] = ++nCounter;
            }

            nOffset *= (-1);
            nLength--;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] solution = new 정수를나선형으로배치하기().solution(4);
        System.out.println(solution);
    }
}
