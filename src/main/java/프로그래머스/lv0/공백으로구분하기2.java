package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 공백으로구분하기2 {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(my_string);

        List<String> list = new ArrayList<>();

        while (st.hasMoreElements()) {
            list.add(st.nextToken());
        }

        answer = list.toArray(String[]::new);

        return answer;
    }
}
