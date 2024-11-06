package Codingbat.String_3;

public class CountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("222abyyycdXXX"));
    }

    public static int countTriple(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 == str.length()) {
                break;
            }
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)) && str.substring(i, i + 1).equals(str.substring(i + 2, i + 3))) {
                a++;
            }
        }
        return a;
    }
}