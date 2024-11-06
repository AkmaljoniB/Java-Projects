package Boolean;

import java.util.Scanner;

public class Boolean_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c ;
        int x = scanner.nextInt();
        a = x / 100 ;
        b = (x /10)%10 ;
        c = (x % 10)%10;
        boolean n = ((a<b)&&(b<c)||(a>b)&&(b>c)) ? true : false ;
        System.out.println(n);
    }
}
