import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        List<String> list = List.of(String.valueOf(order).split(""));
        for (String a : list) {
            if (a.contains("3") || a.contains("6") || a.contains("9"))
                answer++;
        }
        return answer;
    }
}