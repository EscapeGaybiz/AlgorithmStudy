import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        List<String> list = List.of(String.valueOf(order).split(""));
        for (String a : list) {
            if (a.matches("[369]"))
                answer++;
        }
        return answer;
    }
}