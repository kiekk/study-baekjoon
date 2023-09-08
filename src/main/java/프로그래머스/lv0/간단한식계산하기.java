package 프로그래머스.lv0;

public class 간단한식계산하기 {
    public int solution(String binomial) {
        int answer = 0;
        String[] nums = binomial.split("[+|\\-|*|/]");

        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        if (binomial.contains("+")) {
            answer = num1 + num2;
        } else if (binomial.contains("-")) {
            answer = num1 - num2;
        } else if (binomial.contains("*")) {
            answer = num1 * num2;
        } else {
            answer = num1 / num2;
        }

        return answer;
    }
}
