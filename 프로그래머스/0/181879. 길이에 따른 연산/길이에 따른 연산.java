class Solution {
    public int solution(int[] num_list) {
        int x = num_list.length >= 11 ? 0 : 1;
        if (num_list.length >= 11) {
            for (int a : num_list) {
                x += a;
            }
        } else {
            for (int a : num_list) {
                x *= a;
            }
        }
        return x;
    }
}