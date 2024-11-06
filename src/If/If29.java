package If;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a>0 && a%2==0){
            System.out.println("Адади ҷуфти мусбӣ");
        } else {
            System.out.println("Адади тоқи мусбӣ");
        }
        if (a<0 && a%2==0){
            System.out.println("Адади ҷуфти манфӣ");
        } else {
            System.out.println("Адади тоқи манфӣ");
        }
        if (a==0){
            System.out.println("cufr");
        }
    }
}
