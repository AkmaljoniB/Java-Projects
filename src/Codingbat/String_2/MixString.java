package Codingbat.String_2;

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyzd"));
    }

    public static String mixString(String a, String b) {
        String s = "";
        int c=1;
        for (int i = 0; i < a.length(); i ++) {
            s = s.concat(a.substring(i, i + 1));
            for (int i1 = c; i1 <= b.length(); i1 ++) {
                s = s.concat(b.substring(i1-1, i1));
                c++;
                break;
            }
        }
        if (a.length()<b.length()) {
            return s+b.substring(a.length());
        }
        return s;
    }
}
