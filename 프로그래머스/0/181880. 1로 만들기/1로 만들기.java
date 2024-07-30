class Solution {
    public int solution(int[] num_list) {
        int x = 0;
        for (int a : num_list) {
            while (a != 1){
                a /= 2;
                x++;
            }   
        }
        return x;
    }
}