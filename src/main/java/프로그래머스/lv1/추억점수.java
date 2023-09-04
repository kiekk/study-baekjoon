package 프로그래머스.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> nameMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            nameMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += nameMap.getOrDefault(photo[i][j], 0);
            }
        }

        return answer;
    }
}
