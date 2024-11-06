package Codingbat.Recursion_1;

public class Count8 {
    public int count8(int n) {
        String s = String.valueOf(n);
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i!=s.length() -1 && s.substring(i,i+2).equals("88")){
                a++;
            }
            if (s.substring(i, i + 1).equals("8")) {
                a++;
            }
        }
        return a;
    }
}
