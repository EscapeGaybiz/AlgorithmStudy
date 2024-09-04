class Solution {
    public int solution(String s) {
        String[] a = s.replaceAll("-?\\d+ Z", "").split(" ", 0);
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (!"".equals(a[i])) b += Integer.parseInt(a[i]);
        }
        return b;
    }
}