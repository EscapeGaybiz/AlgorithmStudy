import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int b = 0;
        for (int a : array) 
            if(a == n) b++;
        return b;
    }
}