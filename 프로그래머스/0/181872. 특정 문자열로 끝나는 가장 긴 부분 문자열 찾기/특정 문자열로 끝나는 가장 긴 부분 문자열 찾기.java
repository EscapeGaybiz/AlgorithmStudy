class Solution {
    public String solution(String myString, String pat) {
        int a = myString.lastIndexOf(pat); // 발견 못하면 -1 반환
        return a != -1 ? myString.substring(0, a + pat.length()) : "";
    }
}