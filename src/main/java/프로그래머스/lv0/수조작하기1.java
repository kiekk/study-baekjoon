package 프로그래머스.lv0;

import java.util.Map;

public class 수조작하기1 {
    public int solution(int n, String control) {
        int answer = n;
        Map<Character, Integer> controlMap = Map.of(
                'w', 1,
                's', -1,
                'd', 10,
                'a', -10
        );
        for (int i = 0; i < control.length(); i++) {
            answer += controlMap.get(control.charAt(i));
        }
        return answer;
    }
}
