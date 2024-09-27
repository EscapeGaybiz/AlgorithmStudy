class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            b = b.replaceAll("aya|ye|woo|ma", " ");
            if (b.matches("^[^a-zA-Z]*$")) answer++;
        }
        return answer;
    }
}