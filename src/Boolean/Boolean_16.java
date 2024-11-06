package Boolean;

import java.util.Scanner;

public class Boolean_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Boolean n=(a % 2 == 0) ?true : false ;
        System.out.println(n);
    }
}