import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        IntStream a = Arrays.stream(Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1));
        IntStream b = Arrays.stream(Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1));
        return IntStream.concat(a, b).toArray();
    }
}