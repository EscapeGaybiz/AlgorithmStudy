import java.util.*;
class Solution {
    public int solution(int[] num_list, int n) {
        Arrays.sort(num_list);
        int a = Arrays.binarySearch(num_list, n);
        return (a >= 0) ? 1 : 0;
    }
}