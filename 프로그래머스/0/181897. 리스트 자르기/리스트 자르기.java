import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
         return switch (n) {
            case 1 -> Arrays.copyOfRange(num_list, 0, slicer[1] + 1); //0번 인덱스부터 b번 인덱스까지
            case 2 -> Arrays.copyOfRange(num_list,slicer[0], num_list.length); //a번 인덱스부터 마지막 인덱스까지
            case 3 -> Arrays.copyOfRange(num_list,slicer[0], slicer[1] + 1); //a번 인덱스부터 b번 인덱스까지
            case 4 -> IntStream.rangeClosed(slicer[0], slicer[1])
                    .filter(i-> (i - slicer[0]) % slicer[2] == 0)
                    .map(i -> num_list[i])
                    .toArray(); //a번 인덱스부터 b번 인덱스까지 c 간격으로
            default -> throw new IllegalStateException("Unexpected value: " + n);
        };
    }
}