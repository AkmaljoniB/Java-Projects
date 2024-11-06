package MinMax;

import java.util.Scanner;

public class Minmax_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int l = 0, j = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (max < a) {
                max = a;
                l = i;
            }
            if (min >= a) {
                min = a;
                j = i;
            }
        }
        System.out.println(l);
        System.out.println(j);
    }
}
