import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        for (int a : delete_list) set.add(a);
        return Arrays.stream(arr).filter(i -> !set.contains(i)).toArray();
    }
}