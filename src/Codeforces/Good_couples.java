package Codeforces;

import java.util.Scanner;

public class Good_couples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int min = Integer.MAX_VALUE, max = 0;
            int mi=0,ma=0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (max<a){
                    max =a;
                    mi=i;
                }
                if (min>a){
                    min=a;
                    ma=i;
                }
            }
            System.out.println((mi+1)+" "+(ma+1));
        }
    }
}
