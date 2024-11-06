package Codeforces;

import java.util.Scanner;

public class Adding_degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t-- > 0; ) {
            int n = sc.nextInt(), a = sc.nextInt(), max = 0;
            for (int i = 1; i < n; i++) {
                int b = sc.nextInt();
                if (a > b) {
                    int k = 0;
                    while (a > b) {
                        b += Math.pow(2, k);
                        k++;
                    }
                    int l = k - 1;
                    while (a <= b&&l>=0) {
                        if (b - Math.pow(2, l) >= a) b -= Math.pow(2, l);
                        l--;
                    }
                    max = Math.max(max, k);
                }
                a = b;
            }
            System.out.println(max);
        }
    }
}
//6
//-6 -3 -8 -10 -1 10