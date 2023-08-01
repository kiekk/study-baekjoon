package 일차원배열;

import java.util.Scanner;

public class N_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[42];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt() % 42;
            A[num] = 1;
        }

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
