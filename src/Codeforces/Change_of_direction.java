package Codeforces;

import java.util.Scanner;

public class Change_of_direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), min = Math.min(n, m), max = Math.max(n, m);
            if (min == 1 && max > 2) System.out.println(-1);
            else {
                int k=(min-1)*2;
                if (max!=min){
                    k++;
                    if (max-min-1>0){
                        k+=(max-min-1)*2;
                        if (max%2==min%2)k++;
                    }
                }
                System.out.println(k);
            }
        }
    }
}