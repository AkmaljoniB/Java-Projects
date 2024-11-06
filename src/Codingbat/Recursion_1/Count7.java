package Codingbat.Recursion_1;

public class Count7 {
    public int count7(int n) {
        String s = String.valueOf(n);
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("7")) {
                a++;
            }
        }
        return a;
    }
}
