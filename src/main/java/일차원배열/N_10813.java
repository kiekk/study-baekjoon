package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bf.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] A = new int[N + 1];

        for (int i = 0; i < A.length; i++) {
            A[i] = i;
        }

        for (int i = 0; i < M; i++) {
            String[] buckets = bf.readLine().split(" ");
            int b1 = Integer.parseInt(buckets[0]);
            int b2 = Integer.parseInt(buckets[1]);

            if (b1 == b2) {
                continue;
            }

            int tmp = A[b1];
            A[b1] = A[b2];
            A[b2] = tmp;
        }

        String result = "";
        for (int i = 1; i < A.length; i++) {
            result += A[i] + " ";
        }

        System.out.println(result);
    }
}
