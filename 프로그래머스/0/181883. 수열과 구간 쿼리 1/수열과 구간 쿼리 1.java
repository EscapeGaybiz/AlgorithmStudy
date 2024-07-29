class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] a : queries) {
            int s = a[0], e = a[1];
            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        return arr;
    }
}