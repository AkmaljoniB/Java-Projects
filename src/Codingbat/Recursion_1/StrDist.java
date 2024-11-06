package Codingbat.Recursion_1;

public class StrDist {
    public static void main(String[] args) {
        System.out.println(strDist("xyx", "z"));
    }

    public static int strDist(String str, String sub) {
        String s = "";
        for (int i = 0; i < str.length() - sub.length() + 1; i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                s = s.concat(String.valueOf(i)).concat(" ");
            }
        }
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(" ")) {
                a = Integer.parseInt(s.substring(0, i));
                break;
            }
        }
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.substring(i, i + 1).equals(" ")) {
                b = Integer.parseInt(s.substring(i + 1, s.length() - 1));
                break;
            }
        }
        if (s.length()==0){
            return 0;
        }
        if (s.length() < 3) {
            return sub.length();
        }
        return Math.abs(a - b) + sub.length();
    }
}
