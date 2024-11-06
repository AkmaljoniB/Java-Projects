package String;

import java.util.Scanner;

public class Harfhoi_khurd_va_kalon {
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
                    A++;
                }
            }
        }
        for (int j = 0; j < alphabit.length(); j++) {
            for (int b = 0; b < s.length(); b++) {
                if (s.charAt(b) == arr1[j]) {
                    a++;
                }
            }
        }
        System.out.println("Harfhoi Khurd: "+a);
        System.out.println("Harfhoi Kalon: " +A);
    }
}
