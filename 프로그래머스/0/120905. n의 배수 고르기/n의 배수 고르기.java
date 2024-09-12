import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int a : numlist) {
            if (a % n == 0) list.add(a);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}