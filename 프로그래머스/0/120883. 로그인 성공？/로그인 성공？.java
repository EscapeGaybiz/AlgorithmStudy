class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            String id = db[i][0];
            String pw = db[i][1];
            if (id.equals(id_pw[0]) && pw.equals(id_pw[1])) {
                return "login";
            } else if (id.equals(id_pw[0])) {
                return "wrong pw";
            }
        }
        return "fail";
    }
}