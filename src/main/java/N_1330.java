import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        if (n > m) {
            System.out.println(">");
        } else if (n < m) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
