import java.math.*;
class Solution {
    public String solution(String bin1, String bin2) {
        BigInteger a = new BigInteger(bin1, 2);
        BigInteger b = new BigInteger(bin2, 2);
        return a.add(b).toString(2);
    }
}