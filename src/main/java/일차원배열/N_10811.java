package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] A = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = i;
        }

        for (int i = 0; i < M; i++) {
            String[] nums = bf.readLine().split(" ");
            int start = Integer.parseInt(nums[0]);
            int end = Integer.parseInt(nums[1]);

            for (int j = start; j <= end; j++) {
                int index = end--;

                int tmp = A[j];
                A[j] = A[index];
                A[index] = tmp;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
