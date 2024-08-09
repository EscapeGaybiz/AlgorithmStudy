class Solution {
    public int[] solution(int[] arr, int k) {
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = k % 2 == 0? arr[i] + k : arr[i] * k;
        }
        return b;
    }
}