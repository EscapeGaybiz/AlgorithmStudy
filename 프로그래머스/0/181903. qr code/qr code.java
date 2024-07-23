class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            sb.append(r == i % q ? code.charAt(i) : "");
        }
        return sb.toString();
    }
}