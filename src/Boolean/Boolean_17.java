package Boolean;

import java.util.Scanner;

public class Boolean_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean n = (a>99 && a<999) ? true : false ;
        System.out.println(n);
        }
}
