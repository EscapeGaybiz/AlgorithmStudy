class Solution {
    public int[][] solution(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
           a[i][i] = 1;
        }
        return a;
    }
}