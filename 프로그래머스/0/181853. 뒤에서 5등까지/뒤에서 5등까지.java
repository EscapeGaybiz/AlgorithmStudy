import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list); //오름차순 
        return Arrays.copyOf(num_list, 5);
    }
}