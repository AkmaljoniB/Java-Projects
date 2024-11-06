package Boolean;

import java.util.Scanner;

public class Boolean_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean f = false, t = true ;
        if ((a+b)>c){
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}
