package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Chestnoe_razdelenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int q=0,w=0;
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j]==1){
                    q++;
                } else {
                    w++;
                }
            }
            Arrays.sort(arr);
            if (q%2!=0){
                System.out.println("NO");
            } else {
                if (w%2==0){
                    w=0;
                } else {
                    w=1;
                }
                if (q==w){
                    System.out.println("YES");
                } else {
                    int min = Math.min(q / 2, w);
                    if (q / 2 >= w) {
                        q -= min*2;
                        if (q % 2 == 0) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        w -= min;
                        if (w % 2 == 0) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}