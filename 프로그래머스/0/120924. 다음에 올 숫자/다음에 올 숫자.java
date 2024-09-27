class Solution {
    public int solution(int[] common) {
        int a = common[1] - common[0]; //공차
        int b = common[0] != 0 ? common[1] / common[0] : 0; //공비
        return common[2] - common[1] == a ? common[common.length - 1] + a : common[common.length - 1] * b;
    }
}