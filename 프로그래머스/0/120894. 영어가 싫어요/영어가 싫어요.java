import java.util.*;
class Solution {
    public long solution(String numbers) {
        Map<String, String> map = Map.of(
                "zero", "0", "one", "1", "two", "2", "three", "3", "four", "4",
                "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9"
        );
        for (String key : map.keySet()) {
            numbers = numbers.replace(key, map.get(key));
        }
        return Long.parseLong(numbers);
    }
}