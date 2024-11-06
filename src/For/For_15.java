package For;

import java.util.Scanner;

public class For_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int b = 1;
        for (int i = 1; i <= n; ++i) {
            b*=a;
        }
        System.out.println(b);
    }
}
