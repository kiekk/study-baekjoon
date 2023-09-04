package 프로그래머스.lv1;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        Map<String, Integer> playerMap = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int rank = playerMap.get(callings[i]);
            String player = rankMap.get(rank);

            String frontPlayer = rankMap.get(rank - 1);

            playerMap.put(player, rank - 1);
            playerMap.put(frontPlayer, rank);

            rankMap.put(rank - 1, player);
            rankMap.put(rank, frontPlayer);
        }

        answer = rankMap.values().toArray(new String[0]);
        return answer;
    }
}
