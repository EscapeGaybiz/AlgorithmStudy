class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index_list.length; i++) {
            char a = my_string.charAt(index_list[i]);
            sb.append(a);
        }
        return sb.toString();
    }
}