class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int start = 0;
        int end = n - 1; //length - 1;
        int cnt = 1;
        while (cnt <= n * n) {
            for (int i = start; i <= end; i++) answer[start][i] = cnt++;  //우
            for (int i = start + 1; i <= end; i++) answer[i][end] = cnt++;  //하
            for (int i = end - 1; i >= start; i--) answer[end][i] = cnt++;//좌
            for (int i = end - 1; i >= start + 1; i--) answer[i][start] = cnt++;   //상
            start++;
            end--;
        }
        return answer;
    }
}