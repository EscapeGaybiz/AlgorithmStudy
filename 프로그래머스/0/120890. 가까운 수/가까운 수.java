class Solution {
    public int solution(int[] array, int n) {
        int b = array[0];
        for (int a : array) {
            if (Math.abs(a - n) < Math.abs(b - n) || Math.abs(a - n) == Math.abs(b - n) && a < b) {
                b = a;
            }
        }
        return b;
    }
}