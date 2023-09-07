package 프로그래머스.lv0;

public class 글자지우기 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < indices.length; i++) {
            sb.deleteCharAt(indices[i]);
        }

        answer = sb.toString();
        return answer;
    }
}
