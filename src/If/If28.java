package If;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 100 == 0 && a % 400 == 0) {
            System.out.println(366);
        } else {
            System.out.println(365);
        }
    }
}
