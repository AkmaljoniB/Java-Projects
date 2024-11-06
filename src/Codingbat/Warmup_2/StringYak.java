package Codingbat.Warmup_2;

public class StringYak {
    public String stringYak(String str) {
        String s = "";
        String d = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 3).equals("yak")) {
                s = str.substring(0, i) + str.substring(i+3);
            }
            if (i + 3 == str.length()) {
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 3).equals("yak")) {
                d = s.substring(0, i) + s.substring(i+3);
            }
            if (i + 3 == s.length()) {
                break;
            }
        }
        if (d.length()==0){
            return s;
        }
        return d;
    }
}
