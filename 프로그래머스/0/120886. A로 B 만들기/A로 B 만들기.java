class Solution {
    public int solution(String before, String after) {
        for (char c : before.toCharArray()) {
            after = after.replaceFirst(String.valueOf(c), "");
        }
        return after.isEmpty() ? 1 : 0;
    }
}