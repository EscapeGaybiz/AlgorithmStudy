class Solution {
    public int solution(int n) {
        return n / gcd(n, 6);
    }

    int gcd (int a, int b){
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
}