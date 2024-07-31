import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (String a : my_string.split(" ")){
            if(!Objects.equals(a, "")) list.add(a);
        }
        return list.toArray(new String[0]);
    }
}