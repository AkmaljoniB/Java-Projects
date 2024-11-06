package MinMax;

import java.util.Scanner;

public class Minmax_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, MinNum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a < min){
                min = a ;
                MinNum = i ;
            }
        }
        System.out.println(MinNum);
    }
}
