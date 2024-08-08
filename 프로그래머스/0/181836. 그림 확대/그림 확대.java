class Solution {
    public String[] solution(String[] picture, int k) {
        String[] box = new String[picture.length * k];
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            //문자 k번 반복 -> 가로
            for (char ch : picture[i].toCharArray()) {
                sb.append(String.valueOf(ch).repeat(k));
            }
            //한줄 k번 반복 -> 세로
            for (int j = 0; j < k; j++) {
                box[i * k + j] = sb.toString();
            }
        }
        return box;
    }
}