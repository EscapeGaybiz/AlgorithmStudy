class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char a : my_string.toCharArray()) {
            sb.append(String.valueOf(a).repeat(n));
        }
        return sb.toString();
    }
}