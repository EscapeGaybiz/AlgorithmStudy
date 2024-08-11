import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int a = Math.round(array.length / 2);
        return array[a];
    }
}