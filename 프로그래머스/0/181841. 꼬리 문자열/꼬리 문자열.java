class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for (String a : str_list) {
            if(!a.contains(ex)) sb.append(a);
        }
        return sb.toString();
    }
}