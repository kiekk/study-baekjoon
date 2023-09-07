package 프로그래머스.lv0;

public class 문자열겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String first = my_string.substring(0, s);
        String last = my_string.substring(s + overwrite_string.length());
        answer = first + overwrite_string + last;
        return answer;
    }
}
