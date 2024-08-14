import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for(int a : num_list){
            list.add(a);
        }
        Collections.reverse(list);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}