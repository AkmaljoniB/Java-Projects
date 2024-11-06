package If;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println(0);
        }
        if (x % 2 == 0) {
            System.out.println(1);
        }
        if (x % 2 != 0) {
            System.out.println(-1);
        }
    }
}
