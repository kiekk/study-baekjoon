package 프로그래머스.lv0;

public class 코드처리하기 {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = Math.abs(mode - 1);
                continue;
            }
            if (i % 2 == mode) {
                stringBuilder.append(c);
            }
        }

        answer = stringBuilder.toString().isEmpty() ? "EMPTY" : stringBuilder.toString();
        return answer;
    }
}
