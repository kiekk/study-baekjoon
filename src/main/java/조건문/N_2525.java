package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] clocks = bf.readLine().split(" ");
        int h = Integer.parseInt(clocks[0]);
        int m = Integer.parseInt(clocks[1]);
        int cookTime = Integer.parseInt(bf.readLine());

        if (cookTime + m >= 60) {
            h += (cookTime + m) / 60;
            m = (cookTime + m) % 60;
        } else {
            m = cookTime + m;
        }

        if (h >= 24) {
            h = h % 24;
        }

        System.out.println(h + " " + m);
    }
}
