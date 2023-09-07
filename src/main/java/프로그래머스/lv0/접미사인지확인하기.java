package 프로그래머스.lv0;

public class 접미사인지확인하기 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        answer =
                my_string.contains(is_suffix) && my_string.lastIndexOf(is_suffix) + is_suffix.length() == my_string.length()
                ? 1 : 0;
        return answer;
    }
}
