import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
       for (int x : indices) {
            my_string = new StringBuilder(my_string).replace(x, x + 1, " ").toString();
        }
        return my_string.replace(" ", "");
    }
}