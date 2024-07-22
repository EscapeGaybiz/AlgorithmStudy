class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            int x = parts[i][0];
            int y = parts[i][1];
            answer.append(my_strings[i].substring(x, y + 1));
        }
        return answer.toString();
    }
}