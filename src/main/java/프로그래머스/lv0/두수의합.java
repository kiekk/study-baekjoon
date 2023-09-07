package 프로그래머스.lv0;

import java.math.BigInteger;

public class 두수의합 {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        answer = numA.add(numB).toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 두수의합().solution("18446744073709551615", "287346502836570928366"));
    }
}
