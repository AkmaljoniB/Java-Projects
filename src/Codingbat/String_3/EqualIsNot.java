package Codingbat.String_3;

public class EqualIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is notnot"));
    }
    public static boolean equalIsNot(String str) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == i + 2) {
                break;
            }
            if (str.substring(i, i + 2).equals("is")) {
                a++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == i + 2) {
                break;
            }
            if (str.substring(i, i + 3).equals("not")) {
                b++;
            }
        }
        if (a == b) {
            return true;
        }
        return false;
    }
}