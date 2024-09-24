class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int a : array) {
            answer += (int) String.valueOf(a).chars().filter(c -> c == '7').count();
        }
        return answer;
    }
}