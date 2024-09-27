class Solution {
    public int solution(int a, int b) {
         int d = b / gcd(a, b);
        while (d != 1) {
            if (d % 2 == 0) {
                d /= 2;
            } else if (d % 5 == 0) {
                d /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
        //유클리드 호제법 / 두 수 의 최대 공약수 구하기
        private int gcd (int a, int b){
            if (b == 0) { //분모
                return a;
            } else {
                return gcd(b, a % b);
            }
        }
}