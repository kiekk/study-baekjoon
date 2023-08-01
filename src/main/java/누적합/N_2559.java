package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2559
public class N_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int MAX = 0;

        for (int i = 0; i < M; i++) {
            MAX = MAX + A[i];
        }

        int temp = MAX;
        for (int i = M; i < N; i++) {
            temp = temp - A[i-M] + A[i];
            MAX = Math.max(MAX, temp);
        }

        System.out.println(MAX);
    }
}
