class Solution {
    public int solution(int[] numbers, int n) {
       int answer = 0;
        for (int a : numbers) {
            while (answer <= n) {
                answer += a;
                break;
            }
        }
        return answer;
    }
}