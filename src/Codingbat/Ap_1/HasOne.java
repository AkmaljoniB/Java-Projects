package Codingbat.Ap_1;

public class HasOne {
    public boolean hasOne(int n) {
        String s = String.valueOf(n);
        for (int i = 0 ; i < s.length();i ++) {
            if (s.substring(i, i+1).equals("1")) {
                return true;
            }
        }
        return false;
    }
}
