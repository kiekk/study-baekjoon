package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[] A = new int[N];

        for (int i = 0; i < M; i++) {
            String[] nums = bf.readLine().split(" ");
            int start = Integer.parseInt(nums[0]);
            int end = Integer.parseInt(nums[1]);
            int num = Integer.parseInt(nums[2]);

            for (int j = start; j <= end; j++) {
                A[j - 1] = num;
            }
        }

        String result = "";
        for (int i = 0; i < A.length; i++) {
            result += A[i] + " ";
        }

        System.out.println(result);
    }
}
