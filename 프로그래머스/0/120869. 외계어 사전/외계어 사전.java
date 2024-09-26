class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            boolean match = true;
            for (int j = 0; j < spell.length; j++) {
                if (!dic[i].contains(spell[j])) {
                    match = false;
                    break;
                }
            }
            if (match) return 1;
        }
        return 2;
    }
}