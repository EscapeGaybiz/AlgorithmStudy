import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) if(attendance[i]) list.add(new int[]{rank[i], i});
        list.sort(Comparator.comparingInt(i -> i[0]));
        return 10000 * list.get(0)[1] + 100 * list.get(1)[1] + list.get(2)[1];
    }
}