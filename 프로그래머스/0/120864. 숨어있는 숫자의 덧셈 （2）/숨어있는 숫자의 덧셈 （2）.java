class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] a = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for (String b : a) {
            if(!b.trim().isEmpty()){
                answer += Integer.parseInt(b);
            }
        }
        return answer;
    }
}