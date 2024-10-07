import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            if (Arrays.stream(spell).allMatch(word::contains)) {
                return 1;
            }
        }
        return 2;
    }
}