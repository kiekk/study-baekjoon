package 프로그래머스.lv1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            participantMap.put(completion[i], participantMap.get(completion[i]) - 1);
        }

        answer = participantMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() != 0)
                .findFirst()
                .get()
                .getKey();

        return answer;
    }
}
