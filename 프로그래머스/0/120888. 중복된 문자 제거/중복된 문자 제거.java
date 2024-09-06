import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] words = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
        return String.join("", set);
    }
}