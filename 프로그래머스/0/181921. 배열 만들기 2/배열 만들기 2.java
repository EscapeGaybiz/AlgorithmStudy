import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) { // 5 ~ 500
            String a = Integer.toString(i);
            boolean val = true;
            for (char c : a.toCharArray()) {
                if (c != '5' && c != '0') {
                    val = false;
                    break;
                }
            }
            if (val) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }

        int[] new_list = list.stream().mapToInt(Integer::intValue).toArray();
        return new_list;
    }
}