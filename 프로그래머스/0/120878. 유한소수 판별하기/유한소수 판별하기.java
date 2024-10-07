class Solution {
    public int solution(int a, int b) {
        b /= gcd(a, b);
        while (b % 2 == 0)
            b /= 2;
        while (b % 5 == 0)
            b /= 5;

        return b == 1 ? 1 : 2;
    }
    

    //유클리드 호제법 / 두 수 의 최대 공약수 구하기
    private int gcd(int m, int n) {
        return m % n == 0 ? n : gcd(n, m % n);
    }
}