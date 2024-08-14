class Solution {
    public int[] solution(int[] num_list) {
        int[] b = {0, 0};
        for(int a : num_list) b[a % 2]++;
        return b;
    }
}