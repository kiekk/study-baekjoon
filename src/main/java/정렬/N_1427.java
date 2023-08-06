package 정렬;

import java.util.Scanner;

public class N_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] A = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            A[i] = Integer.parseInt(N.substring(i, i + 1));
        }

        for (int i = 0; i < N.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < N.length(); j++) {
                if (A[j] > A[Max]) {
                    Max = j;
                }
            }
            if (A[i] < A[Max]) {
                int tmp = A[i];
                A[i] = A[Max];
                A[Max] = tmp;
            }
        }

        for (int i = 0; i < N.length(); i++) {
            System.out.print(A[i]);
        }

    }
}
