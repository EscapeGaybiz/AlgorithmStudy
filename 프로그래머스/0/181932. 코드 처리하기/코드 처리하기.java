class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        char[] codeArray = code.toCharArray();
        int mode = 0;
        
        for (int idx = 0; idx < codeArray.length; idx++) {
            if (codeArray[idx] == '1') {
                mode = 1 - mode;
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    ret.append(codeArray[idx]);
                } else if (mode == 1 && idx % 2 == 1){
                    ret.append(codeArray[idx]);
                }
            }
        }
        return (ret.length() == 0 ? "EMPTY" : ret.toString());
    }
}