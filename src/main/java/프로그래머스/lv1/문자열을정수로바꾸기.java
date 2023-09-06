package 프로그래머스.lv1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;

        if (s.contains("-")) {
            answer = -Integer.parseInt(s.substring(1));
        } else if (s.contains("+")) {
            answer = Integer.parseInt(s.substring(1));
        } else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}
