package Codingbat.Ap_1;

public class DividesSelf {
    public boolean dividesSelf(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("0") || n % Integer.parseInt(s.substring(i, i + 1)) != 0) {
                return false;
            }
        }
        return true;
    }
}
