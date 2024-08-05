class Solution {
    public int[] solution(int[] arr, int n) {
        boolean a = arr.length % 2 == 1; //홀수 
        for (int i = 0; i < arr.length; i++) if ((a && i % 2 == 0) || (!a && i % 2 == 1)) arr[i] += n;
        return arr;
    }
}