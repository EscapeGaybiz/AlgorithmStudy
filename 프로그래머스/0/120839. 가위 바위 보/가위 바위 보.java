class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char ch : rsp.toCharArray()) {
            sb.append(ch == '2' ? '0' : ch == '0' ? '5' : '2');
        }
        return sb.toString();
    }
}