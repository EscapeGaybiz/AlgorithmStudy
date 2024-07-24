import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = end_num; i <= start_num; i++) {
            list.add(i);
        }
        // Collections.sort(list, Comparator.reverseOrder());
        
        return list.stream()
            .sorted(Comparator.reverseOrder())
            .mapToInt(i -> i).toArray();
    }
}