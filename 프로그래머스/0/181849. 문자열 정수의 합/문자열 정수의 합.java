class Solution {
    public int solution(String num_str) {
        int b = 0;
        for (char a : num_str.toCharArray()) b += a - '0';
        return b;
    }
}