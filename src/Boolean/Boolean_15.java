package Boolean;

import java.util.Scanner;

public class Boolean_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Boolean n =false, v = true;
        if ((a<=0 && b>0 && c>0)
                || (a>0 && b<=0 && c>0)
                || (a>0 && b>0 && c<=0)) {
            System.out.println(v);
        } else  {
            System.out.println(n);
        }
    }
}
