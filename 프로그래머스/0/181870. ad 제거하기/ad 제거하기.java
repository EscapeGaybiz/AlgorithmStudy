import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String a : strArr) {
            if(!a.contains("ad")) list.add(a);
        }
        return list.toArray(new String[0]);
    }
}