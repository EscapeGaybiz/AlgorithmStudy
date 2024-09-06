class Solution {
    public int solution(int[] sides) {
        int b = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int c = Math.min(sides[0], Math.min(sides[1], sides[2]));
        int a = sides[0] + sides[1] + sides[2] - b - c;
        return b < a + c ? 1 : 2;
    }
}