package Codingbat.Recursion_1;

public class AllStar {
    public String allStar(String str) {
        String s ="";
        for (int i =0;i<str.length();i++) {
            if (i != str.length() - 1) {
                s = s.concat(str.substring(i, i + 1)).concat("*");
            } else {
                s=s.concat(str.substring(i,i+1));
            }
        }
        return s;
    }
}
