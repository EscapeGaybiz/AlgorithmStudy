class Solution {
    public String[] solution(String[] picture, int k) {
        String[] a = new String[picture.length * k];
        int idx = 0;
        
        for (String s : picture) {
            StringBuilder sb = new StringBuilder();
            //문자 k번 반복 -> 가로 확대
            for (char ch : s.toCharArray()) {
                sb.append(String.valueOf(ch).repeat(k));
            }
            //한줄 k번 반복 -> 세로 확대
            String b = sb.toString();
           
            for (int i = 0; i < k; i++) {
                a[idx++] = b;
            }
        }
        return a;
    }
}