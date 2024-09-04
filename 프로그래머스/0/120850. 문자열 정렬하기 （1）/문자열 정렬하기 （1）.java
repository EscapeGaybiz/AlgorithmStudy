import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String a = my_string.replaceAll("[a-zA-Z]", "");
        return Arrays.stream(a.split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}