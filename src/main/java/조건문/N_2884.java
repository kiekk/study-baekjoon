package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] clocks = bf.readLine().split(" ");
        int h = Integer.parseInt(clocks[0]);
        int m = Integer.parseInt(clocks[1]);

        if (m >= 45) {
            m -= 45;
        } else {
            m = m + 60 - 45;

            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
        }

        System.out.println(h + " " + m);
    }
}
