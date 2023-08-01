package 일차원배열;

import java.util.Scanner;

public class N_5597 {
    public static void main(String[] args) {
        int[] A = new int[31];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();

            A[num] = 1;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
