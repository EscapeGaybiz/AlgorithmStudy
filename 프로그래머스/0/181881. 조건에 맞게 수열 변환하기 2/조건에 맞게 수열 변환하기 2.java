import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] arrBefore;
        int x = 0;
        do {
            arrBefore = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = 2 * arr[i] + 1;
                }
            }
            x++;
        } while (!Arrays.equals(arr, arrBefore));
        return x - 1;
    }
}