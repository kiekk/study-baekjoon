package 프로그래머스.lv1;

public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";

        String[] spellings = s.split("");
        int index = 0;
        for (int i = 0; i < spellings.length; i++) {
            if (spellings[i].equals(" ")) {
                index = 0;
                continue;
            }

            if (index % 2 == 0) {
                spellings[i] = spellings[i].toUpperCase();
            } else {
                spellings[i] = spellings[i].toLowerCase();
            }
            index++;
        }

        answer = String.join("", spellings);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new 이상한문자만들기().solution("try hello world"));
    }
}
