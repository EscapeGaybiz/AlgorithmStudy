import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        IntStream a = Arrays.stream(num_list, n, num_list.length);
        IntStream b = Arrays.stream(num_list, 0, n);
        return IntStream.concat(a, b).toArray();
    }
}