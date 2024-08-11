class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2; //공통분모
        int numer = numer1 * denom2 + numer2 * denom1; //분자
        int gdcValue = gdc(numer, denom);

        int[] answer = new int[2];
        answer[0] = numer / gdcValue;
        answer[1] = denom / gdcValue;

        return answer;
    }
    
     public static int gdc(int a, int b) { 
        return b == 0 ? a : gdc(b, a % b);
    }
}