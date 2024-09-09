import java.util.*;
class Solution {
    public String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(String.valueOf(ch), map.getOrDefault(String.valueOf(ch), 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (String b : map.keySet()) {
            if (map.get(b) == 1) {
                list.add(b);
            }
        }
        Collections.sort(list);
        return String.join("", list);
    }
}