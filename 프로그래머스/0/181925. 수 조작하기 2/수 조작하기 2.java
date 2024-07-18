import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numLog) {
     StringBuilder sb = new StringBuilder();
        Map<Integer, String> d = Map.of(1,"w", -1,"s", 10,"d", -10,"a");

        IntStream.range(1, numLog.length)
                .mapToObj(i -> d.get(numLog[i] - numLog[i -1]))
                .forEach(sb::append);

        return sb.toString();
    }
}