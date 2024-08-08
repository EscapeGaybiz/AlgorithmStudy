class Solution {
    public int solution(String[] order) {
       int answer = 0;
        for (String a : order) {
            if (a.contains("ame")) {
                answer += 4500;
            } else if (a.contains("latte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}