class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] a = String.valueOf(n).split("");
        for (String b : a) {
            answer += Integer.parseInt(b);
        }
        return answer;
    }
}