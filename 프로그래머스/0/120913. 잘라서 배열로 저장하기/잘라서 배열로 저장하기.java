class Solution {
    public String[] solution(String my_str, int n) {
        String[] arry = new String[(int) Math.ceil((double) my_str.length() / n)];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = my_str.substring(i * n, Math.min(i * n + n, my_str.length()));
        }
        return arry;
    }
}