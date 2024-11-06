package Codeforces;
import java.util.Scanner;
public class Virazhenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x1 = (a + b) * c;
        int x4 = a * (b + c);
        int x2 = a + b * c;
        int x6 = a * b + c;
        int x3 = a * b * c;
        int x5 = a + b + c;
        int max = Math.max(x1,Math.max(x2,Math.max(x3,Math.max(x4,Math.max(x5,x6)))));
        System.out.println(max);
    }
}