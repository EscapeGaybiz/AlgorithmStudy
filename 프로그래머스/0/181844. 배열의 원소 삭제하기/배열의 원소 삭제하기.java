import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr) list.add(a);
        for (int a : delete_list) list.remove((Integer) a);
        return list.stream().mapToInt(i -> i).toArray();
    }
}