import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int idx = 0, value = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                idx = i + 1;
                value = array[i + 1];
            }
        }
        return new int[]{value, idx};
    }
}