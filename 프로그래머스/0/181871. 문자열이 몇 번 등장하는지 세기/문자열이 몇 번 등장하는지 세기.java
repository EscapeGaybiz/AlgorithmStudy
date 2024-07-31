class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int fromIndex = myString.indexOf(pat);
        while (fromIndex != -1) {
            cnt++;
            fromIndex = myString.indexOf(pat, fromIndex + 1);
        }
        return cnt;
    }
}