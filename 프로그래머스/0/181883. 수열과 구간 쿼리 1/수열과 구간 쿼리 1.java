class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         for (int[] a : queries) {
            int s = a[0];
            int e = a[1];

            for (int i = 0; i < arr.length; i++) {
                if (i >= s && i <= e) {
                    arr[i] = arr[i] + 1;
                }
            }
        }
        return arr;
    }
}