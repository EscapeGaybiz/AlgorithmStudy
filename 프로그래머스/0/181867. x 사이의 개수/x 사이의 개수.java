import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        for (String a : myString.split("x", -1)) {
            list.add(a.length());
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}