class Solution {
    public int solution(String my_string) {
        String[] my = my_string.split(" ");
        int a = Integer.parseInt(my[0]);
        for (int i = 1; i < my.length; i+= 2) 
            a += my[i].equals("+") ? Integer.parseInt(my[i + 1]) : -Integer.parseInt(my[i + 1]);
        return a;
    }
}