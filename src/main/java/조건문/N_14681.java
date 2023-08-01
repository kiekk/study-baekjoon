package 조건문;

import java.util.Scanner;

public class N_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] q = {1, 4, 2, 3};
        int count = 0;
        if (n1 < 0) {
            count += 2;
        }

        if (n2 < 0) {
            count += 1;
        }

        System.out.println(q[count]);

    }
}
