import java.util.*;
class Solution {
    public int solution(int num, int k) {
        String a = String.valueOf(num);
        int idx = a.indexOf(Character.forDigit(k, 10));
        return idx == -1 ? -1 : idx + 1;
    }
}