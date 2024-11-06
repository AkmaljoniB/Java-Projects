package Task;

import java.util.Scanner;

public class Codda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int k1 = scanner.nextInt();
        int b = 0;
        for (int i = k; i <= k1; i++) {
            for (int i1 = 2; i1 < k1; i1++) {
                if (i % i1 != 0) {
                    b++;
                }
            }
            if (b >= k1-3) {
                System.out.println(i);
            }
            b = 0;
        }
        if (k == k1) {
            System.out.println("Absent");
        }
    }
}