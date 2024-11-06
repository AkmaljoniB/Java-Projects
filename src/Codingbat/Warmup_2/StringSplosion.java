package Codingbat.Warmup_2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String s = "";
        String s1 = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            s = s + arr[i];
            s1 = s1.concat(s);
        }
        return s1;
    }
}
