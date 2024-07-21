class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] q : queries) {
            int s = q[0]; //2
            int e = q[1]; //3
            StringBuilder x = new StringBuilder(sb.substring(s, e + 1)).reverse();
            sb.replace(s, e + 1, x.toString());
        }
        return sb.toString();
    }
}