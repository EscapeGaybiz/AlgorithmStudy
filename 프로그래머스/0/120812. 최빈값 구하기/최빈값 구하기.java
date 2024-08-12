import java.util.*;
class Solution {
    public int solution(int[] array) {
        int max = 0, answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            int cnt = map.getOrDefault(a, 0) + 1;
            if (cnt > max) {
                max = cnt;
                answer = a;
            } else if (cnt == max) {
                answer = -1;
            }
            map.put(a, cnt);
        }
        return answer;
    }
}