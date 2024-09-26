class Solution {
    public int solution(int n) {
        int answer = 0, cnt = 0;
        for (int i = 1; cnt < n; i++) {
            if (i % 3 != 0 && !String.valueOf(i).contains("3")) {
                cnt++;
                answer = i;
            } 
        }
        return answer;
    }
}