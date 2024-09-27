import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] list = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(list, (a, b) -> {
            int num1 = Math.abs(a - n), num2 = Math.abs(b - n);
            if (num1 == num2) 
                return b - a; 
            else 
                return num1 - num2;
        });
        return Arrays.stream(list).mapToInt(i->i).toArray();
    }
}