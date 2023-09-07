package 프로그래머스.lv0;

import java.util.HashMap;
import java.util.Map;

public class 문자개수세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        Map<Character, Integer> alpabetMap = new HashMap<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            alpabetMap.put((char) i, 0);
        }

        for (int i = 'a'; i <= 'z'; i++) {
            alpabetMap.put((char) i, 0);
        }

        for (char c : my_string.toCharArray()) {
            alpabetMap.put(c, alpabetMap.getOrDefault(c, 0) + 1);
        }

        int offset = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            answer[offset] = alpabetMap.getOrDefault((char) i, 0);
            offset++;
        }

        for (int i = 'a'; i <= 'z'; i++) {
            answer[offset] = alpabetMap.getOrDefault((char) i, 0);
            offset++;
        }

        return answer;
    }
}
