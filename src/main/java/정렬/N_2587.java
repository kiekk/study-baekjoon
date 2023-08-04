package 정렬;

import java.util.Scanner;

public class N_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] A = new int[N];
        int sum = 0;
        int average = 0;
        int middleNum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                int tmp;
                if (A[j] > A[j + 1]) {
                    tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }

        average = sum / N;
        middleNum = A[N / 2];

        System.out.println(average);
        System.out.println(middleNum);
    }
}
