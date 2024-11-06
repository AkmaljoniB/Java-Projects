package Codingbat.String_3;

public class CountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
    }

    public static int countYZ(String str) {
        String Alphabit = "abcdefghijklmnopqrstuvwxyz";
        int b = 0, c = 0;
        for (int d = 0; d < str.length(); d++) {
            for (int i = 0; i < Alphabit.length(); i++) {
                if (str.substring(d, d + 1).equalsIgnoreCase(Alphabit.substring(i, i + 1))) {
                    b++;
                    break;
                }
            }
            if (b != 1 && d != 0) {
                if (str.substring(d - 1, d).equalsIgnoreCase("y") || str.substring(d - 1, d).equalsIgnoreCase("z")) {
                    c++;
                }
            } else {
                b = 0;
            }
        }
        if (str.substring(str.length() - 1).equalsIgnoreCase("z") || str.substring(str.length() - 1).equalsIgnoreCase("y")) {
            c++;
        }
        return c;
    }
}