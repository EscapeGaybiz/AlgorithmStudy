class Solution {
    public String solution(int age) {
        String a = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            sb.append((char)(a.charAt(i) + 49));
        }
        return sb.toString();
    }
}