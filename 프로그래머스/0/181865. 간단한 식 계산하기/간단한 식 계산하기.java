class Solution {
    public int solution(String binomial) {
        String[] b = binomial.split(" ");
        int answer = 0;
        switch(b[1]) {
            case "+" -> answer = Integer.parseInt(b[0]) + Integer.parseInt(b[2]);
            case "-" -> answer = Integer.parseInt(b[0]) - Integer.parseInt(b[2]);
            case "*" -> answer = Integer.parseInt(b[0]) * Integer.parseInt(b[2]);
        }
        return answer;
    }
}