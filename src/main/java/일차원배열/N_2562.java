package 일차원배열;

import java.util.Scanner;

public class N_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX = sc.nextInt();
        int POSITION = 1;

        for (int i = 1; i <= 8; i++) {
            int num = sc.nextInt();

            if (MAX < num) {
                MAX = num;
                POSITION = i + 1;
            }
        }

        System.out.println(MAX);
        System.out.println(POSITION);
    }
}
