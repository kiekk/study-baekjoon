package 프로그래머스.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";

        List<String> strList = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++) {
            strList.add(s.substring(i - 1, i));
        }

        strList.sort(Comparator.reverseOrder());

        answer = String.join("", strList);
        return answer;
    }
}
