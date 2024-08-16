class Solution {
    public int solution(int n) {
        return factorial(n);
    }
    
    public int factorial(int a){
        if (a < 2) return 0; 
        if (a % 2 == 0) {
            return a + factorial(a - 2);
        } else {
            return factorial(a - 1);
        }
    }
}