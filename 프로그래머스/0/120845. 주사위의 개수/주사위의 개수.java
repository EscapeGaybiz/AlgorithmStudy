class Solution {
    public int solution(int[] box, int n) {
        int a = box[0] / n, b = box[1] / n, c = box[2] / n;
        return a * b * c;
    }
}