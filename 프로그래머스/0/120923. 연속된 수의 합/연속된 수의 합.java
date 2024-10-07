import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        List<Integer> list = new ArrayList<>();
        int start = (total / num) - ((num - 1) / 2);
        for (int i = 0; i < num; i++) {
            list.add(start + i);
        }
        return list.stream().mapToInt(i -> i).toArray(); 
    }
}