class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] a = new int[201];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                a[j]++; 
            }
        }
        for (int cnt : a) {
            if (cnt > 1) answer++;
        }       
        return answer;
    }
}