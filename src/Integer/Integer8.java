package Integer;

import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("A = ");
        a = scanner.nextInt();
        b = a/10;
        c = a%10;
        System.out.println("A = "+((c*10)+b));
    }
}
