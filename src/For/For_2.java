package For;

import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            n++;
        }
            System.out.println("n = "+n);
        }
}