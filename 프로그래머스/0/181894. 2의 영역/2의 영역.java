import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        return list.isEmpty() ? new int[]{-1} : list.size() == 1 ? new int[]{2} :
                        Arrays.copyOfRange(arr, Collections.min(list), Collections.max(list) + 1);
    }
}