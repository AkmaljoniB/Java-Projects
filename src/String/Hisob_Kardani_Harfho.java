package String;

import java.util.Scanner;

public class Hisob_Kardani_Harfho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = 0;
        char[]arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!(arr[i] == ' ')) {
                a++;
            }
        }
        System.out.println("Harf: "+a);
//        for (int i = 0; i < s.length(); i++) {
//            if (arr[i] == ' ') {
//                a++;
//            }
//        }
//        System.out.println("Probel: "+a);
//        System.out.println("Harf: "+(s.length()-a));
    }
}