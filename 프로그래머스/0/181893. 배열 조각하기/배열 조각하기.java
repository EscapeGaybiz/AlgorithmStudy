import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] l = Arrays.copyOfRange(arr, 0, arr.length);
        for (int i = 0; i < query.length; i++) {
            l = (i % 2 == 0) ? Arrays.copyOfRange(l, 0, query[i] + 1) : 
                               Arrays.copyOfRange(l, query[i], l.length); 
        }
        return l;
    }
}