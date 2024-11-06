package Task;

import java.util.Scanner;

public class Masohat_va_Chand_C_Megundjad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s, d, t, h, p;
        s = a * b;
        h = c * c;
        d = s / h;
        p = d * h;
        t = s - p;
        System.out.println(d);
        System.out.println(t);
    }
}