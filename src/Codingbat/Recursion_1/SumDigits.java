package Codingbat.Recursion_1;

public class SumDigits {
    public int sumDigits(int n) {
        String s = String.valueOf(n);
        int a =0;
        for (int i = 0; i < s.length(); i++) {
            a+=Integer.parseInt(s.substring(i,i+1));
        }
        return a;
    }
}
