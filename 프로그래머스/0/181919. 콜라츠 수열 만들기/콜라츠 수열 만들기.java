import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
       List<Integer> list = new ArrayList<>();

        list.add(n);
        for (int i = 1; ; i++) {
            if (n != 1) {
                if (n % 2 == 0) {
                    list.add(n / 2);
                    n = n / 2;
                } else {
                    list.add(3 * n + 1);
                    n = 3 * n + 1;
                }
            } else {
                break;
            }

        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}