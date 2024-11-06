package Codingbat.Warmup_1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String s = str.substring(0, n)+str.substring(n+1);
        return s;
    }
}
