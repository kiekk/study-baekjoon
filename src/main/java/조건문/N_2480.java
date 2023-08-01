package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] digits = bf.readLine().split(" ");
        int n1 = Integer.parseInt(digits[0]);
        int n2 = Integer.parseInt(digits[1]);
        int n3 = Integer.parseInt(digits[2]);

        int price;
        if (n1 != n2 && n2 != n3 && n3 != n1) {
            price = Math.max(Math.max(n1, n2), n3) * 100;
        } else {
            if (n1 == n2 && n2 == n3) {
                price = 10000 + n2 * 1000;
            } else {
                if (n1 == n2 || n1 == n3) {
                    price = 1000 + n1 * 100;
                } else {
                    price = 1000 + n2 * 100;
                }
            }
        }
        System.out.println(price);
    }
}
