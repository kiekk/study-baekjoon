package 프로그래머스.lv0;

public class 첫번째로나오는음수 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
