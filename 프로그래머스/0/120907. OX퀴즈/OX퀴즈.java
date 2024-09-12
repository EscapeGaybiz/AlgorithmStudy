import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for (String a : quiz) {
            String[] b = a.split(" ");
            String operator = b[1];
            int x = Integer.parseInt(b[0]);
            int y = Integer.parseInt(b[2]);
            int z = Integer.parseInt(b[4]);
            list.add((operator.equals("-") ? x - y : x + y) == z ? "O" : "X");
        }
        return list.toArray(new String[0]);
    }
}