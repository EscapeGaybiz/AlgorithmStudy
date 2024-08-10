import java.util.*;
class Solution {
    public int[][] solution(int[][] arr) {
        int a = Math.max(arr.length, arr[0].length);
        int[][] result = new int[a][a];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, result[i],0, arr[0].length);
        }
        return result;
    }
}