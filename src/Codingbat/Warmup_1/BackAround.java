package Codingbat.Warmup_1;

public class BackAround {
    public String backAround(String str) {
        String s = str.substring(str.length()-1)+str+str.substring(str.length()-1);
        return s;
    }
}
