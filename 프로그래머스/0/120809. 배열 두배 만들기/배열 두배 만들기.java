import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
           Arrays.fill(numbers, i, i + 1, numbers[i] * 2);
        }
        return numbers;
    }
}