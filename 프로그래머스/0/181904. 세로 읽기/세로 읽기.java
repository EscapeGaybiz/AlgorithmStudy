class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if(i * m + m <= my_string.length()){
                String[] a = my_string.substring(i * m, i * m + m).split("");
                sb.append(a[c - 1]);
            }
        }
        return sb.toString();
    }
}