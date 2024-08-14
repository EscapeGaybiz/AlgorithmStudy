class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(char a : my_string.toCharArray()) sb.append(a);
        
        return sb.reverse().toString();
    }
}