import java.util.*;
class Solution {
    public int solution(int[] arr, int idx) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (idx <= i && arr[i] == 1) {
                list.add(i);
            }
        }
        Collections.sort(list);
        
        return list.isEmpty() ? -1 : list.get(0);
    }
}