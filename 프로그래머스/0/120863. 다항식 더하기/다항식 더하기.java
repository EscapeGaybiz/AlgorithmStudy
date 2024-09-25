class Solution {
    public String solution(String polynomial) {
        int cnt = 0; //x항
        int n = 0; //상수항
        String[] a = polynomial.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i += 2) {
            if (a[i].matches("^\\d+x$")) {
                cnt += Integer.parseInt(a[i].replace("x", ""));  // 'x'를 제외하고 숫자만 추출
            } else if (a[i].equals("x")){
                cnt += 1;
            } else {
                n += Integer.parseInt(a[i]);
            }
        }
        if (cnt > 0) {
            if (cnt == 1) {
                sb.append("x");
            } else {
                sb.append(cnt).append("x");
            }
        }
        if (n > 0) {
            if (cnt > 0) {
                sb.append(" + ");
            }
            sb.append(n);
        }
        return sb.toString();
    }
}