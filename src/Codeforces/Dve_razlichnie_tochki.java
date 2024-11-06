package Codeforces;

import java.util.Scanner;

public class Dve_razlichnie_tochki {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int q =scanner.nextInt();
        for (int i = 0 ; i < q;i++){
            int l1 =scanner.nextInt();
            int r1 =scanner.nextInt();
            int l2 =scanner.nextInt();
            int r2 =scanner.nextInt();
            int min1 = Math.min(l1,r1);
            int min2 = Math.min(l2,r2);
            if ((r1-l1)/2+min1 == (r2-l2)/2+min2) {
                System.out.println((r1 - l1) / 2 + min1);
                System.out.println((r2 - l2) / 2 + min2+1);
            } else {
                System.out.println((r1 - l1) / 2 + min1);
                System.out.println((r2 - l2) / 2 + min2);
            }
        }
    }
}
