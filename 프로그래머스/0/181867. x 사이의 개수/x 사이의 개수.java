import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String b = myString.replaceAll("x", "-");
        List<Integer> list = new ArrayList<>();
        for (String a : b.split("-", -1)) {
            list.add(a.length());
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}