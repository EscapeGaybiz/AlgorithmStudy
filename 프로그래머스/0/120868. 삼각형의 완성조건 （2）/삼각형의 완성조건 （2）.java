class Solution {
    public int solution(int[] sides) {
        int cnt = 0;
        //c 가장 긴 변일 경우
        for (int i = Math.max(sides[0], sides[1]) + 1; i < sides[0] + sides[1]; i++) {
            cnt++;
        }
        //c 나머지 한 변일 경우
        for (int i = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]) + 1; i <= Math.max(sides[0], sides[1]); i++) {
            cnt++;
        }
        return cnt;
    }
}