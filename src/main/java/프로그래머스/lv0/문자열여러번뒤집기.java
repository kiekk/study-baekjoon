package 프로그래머스.lv0;

public class 문자열여러번뒤집기 {
    public String solution(String my_string, int[][] queries) {
        String answer = "";

        char[] chars = my_string.toCharArray();
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                // swap
                char temp = chars[i];
                chars[i] = chars[end];
                chars[end] = temp;

                end--;
            }
        }

        answer = String.valueOf(chars);
        return answer;
    }

}
