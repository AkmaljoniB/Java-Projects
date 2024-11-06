package If;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a==b && b==c && a==c && d==a && d==b && d==c){
            System.out.println(0);
        }
        if (a!=b && b==c && a!=c && d!=a && d==b && d==c) {
            System.out.println(1);
        }
        if (a!=b && b!=c && a==c && d==a && d!=b && d==c) {
            System.out.println(2);
        }
        if (a==b && b!=c && a!=c && d==a && d==b && d!=c) {
            System.out.println(3);
        }
        if (a==b && b==c && a==c && d!=a && d!=b && d!=c) {
            System.out.println(4);
        }
    }
}
