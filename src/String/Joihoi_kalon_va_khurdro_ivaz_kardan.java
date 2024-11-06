package String;

import java.util.Scanner;

public class Joihoi_kalon_va_khurdro_ivaz_kardan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ALPHABIT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabit = "abcdefghijklmnopqrstuvwxyz";
        String s = scanner.nextLine();
        int a = 0;
        int A = 0;
        char[] arr = ALPHABIT.toCharArray();
        char[] arr1 = alphabit.toCharArray();
        for (int i = 0; i < ALPHABIT.length(); i++) {
            for (int d = 0; d < s.length(); d++) {
                if (s.charAt(d) == arr[i]) {
                }
            }
        }
        for (int j = 0; j < alphabit.length(); j++) {
            for (int b = 0; b < s.length(); b++) {
                if (s.charAt(b) == arr1[j]) {
                }
            }
        }
    }
}
