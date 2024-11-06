package Codeforces;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int b =scanner.nextInt();
            int min= Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int a =scanner.nextInt();
                min=Math.min(a-b,min);
                b=a;
            }
            System.out.println(min<0?0:min/2+1);
        }
    }
}
