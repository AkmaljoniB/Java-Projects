package String;

import java.util.Scanner;

public class Hisob_kardani_sadonok_va_hamsado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sadonok = "аоуиеэ";
        String hamsado = "бвгғджзкқлмнпрстфхҳчҷш";
        String a = scanner.nextLine();
        int s = 0 ;
        int h = 0 ;
        char[] arr = sadonok.toCharArray();
        char[] arr1 = hamsado.toCharArray();
        for (int i = 0; i < sadonok.length(); i++) {
            for (int d = 0; d < a.length(); d++) {
                if (a.charAt(d) == arr[i]) {
                    s++;
                }
            }
        }
        for (int j = 0; j < hamsado.length(); j++) {
            for (int b = 0; b < a.length(); b++) {
                if (a.charAt(b) == arr1[j]) {
                    h++;
                }
            }
        }
        String SADONOK = "АОУИЕЭ";
        String HAMSADO = "БВГҒДЖЗКҚЛМНПРСТФХҲЧҶШ";
        int s1 = 0 ;
        int h1 = 0 ;
        char[] arr2 = SADONOK.toCharArray();
        char[] arr3 = HAMSADO.toCharArray();
        for (int i = 0; i < SADONOK.length(); i++) {
            for (int d = 0; d < a.length(); d++) {
                if (a.charAt(d) == arr2[i]) {
                    s1++;
                }
            }
        }
        for (int j = 0; j < HAMSADO.length(); j++) {
            for (int b = 0; b < a.length(); b++) {
                if (a.charAt(b) == arr3[j]) {
                    h1++;
                }
            }
        }
        System.out.println("Садонок: "+(s+s1));
        System.out.println("Ҳамсадо: " +(h+h1));
    }
}