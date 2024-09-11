import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set2 = new HashSet<>(Arrays.asList(s2));
        int answer = 0;
        for (String a : s1) {
            if (set2.contains(a)) answer++;
        }
        return answer;
    }
}