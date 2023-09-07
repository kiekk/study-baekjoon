package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class 할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        Map<Boolean, List<String>> todoMap = Map.of(
                true, new ArrayList<>(),
                false, new ArrayList<>()
        );

        for (int i = 0; i < todo_list.length; i++) {
            todoMap.get(finished[i]).add(todo_list[i]);
        }

        List<String> todoList = todoMap.get(false);
        answer = new String[todoList.size()];

        for (int i = 0; i < todoList.size(); i++) {
            answer[i] = todoList.get(i);
        }

        return answer;
    }

}
