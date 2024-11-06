package For;

import java.util.Scanner;

public class For_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double s = 0;
        for (int i = a; i <= b; i++) {
            s = s + (i * i);
        }
        System.out.println(s);
    }
}
