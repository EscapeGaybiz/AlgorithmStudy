class Solution {
    public int solution(int a, int b, int c) {
     int sum = a + b + c;
        if (a == b && b == c) {
            sum = (int) (sum
                    * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) 
                    * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
        } else if (a == b || a == c || b == c) {
            sum = (int) (sum
                         * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        } 
        return sum;
    }
}