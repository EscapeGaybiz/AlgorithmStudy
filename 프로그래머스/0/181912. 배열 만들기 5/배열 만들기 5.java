import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String a : intStrs) {
            int b = Integer.parseInt(a.substring(s, s + l));
            if (b > k) {
                answer.add(b);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
        
    }
}