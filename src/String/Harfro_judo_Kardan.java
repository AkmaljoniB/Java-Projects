package String;

import java.util.Scanner;

public class Harfro_judo_Kardan {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        char[] charArray = s.toCharArray();
//        for (char element: charArray){
//            System.out.println(element);
//        }
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}