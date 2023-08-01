package 조건문;

import java.util.Scanner;

public class N_9498_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() / 10;
        char[] c = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
        System.out.println(c[n]);
    }
}
