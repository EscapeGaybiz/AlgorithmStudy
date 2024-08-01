import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] a = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" ");
        List<String> list = new ArrayList<>();
        for (String b : a) {
           if(!b.isEmpty()) 
               list.add(b);
        }
        return list.isEmpty() ? new String[] { "EMPTY" } : list.toArray(new String[0]);
    }
}