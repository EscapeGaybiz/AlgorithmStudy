class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int j = 0; j < my_string.length(); j++) {
            int a;
            char ch = my_string.charAt(j);
            if (ch >= 'A' && ch <= 'Z') {
                a = ch - 'A';
            } else {
                a = ch - 'a' + 26;
            }
            answer[a] += 1;
        }
        return answer;
    }
}