class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < dots.length; i++) {
            if (dots[0][0] - dots[i][0] != 0 && dots[0][1] - dots[i][1] != 0) {
                return (Math.abs(dots[i][0] - dots[0][0]) * (dots[i][1] - dots[0][1]));
            }
        }
        return 0;
    }
}