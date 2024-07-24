import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int x : indices) {
            sb.setCharAt(x, ' ');
        }
        return sb.toString().replace(" ", "");
    }
}