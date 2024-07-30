class Solution {
    public int solution(int[] num_list) {
        int x = 1;
        if (num_list.length >= 11) {
            for (int a : num_list) {
                x += a;
            }
            x -= 1;
        } else {
            for (int a : num_list) {
                x *= a;
            }
        }
        return x;
    }
}