package Codeforces;

import java.util.Scanner;

public class Permutation_sort {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int a =scanner.nextInt();
            int k =0;
            int min=a;
            for (int i = 1; i < n; i++) {
                int b= scanner.nextInt();
                if (a>b)k=1;
                a = b;
            }
            if (k==1 && min!=1&&a!=n)k=2;
            if (k==2 && min==n && a==1)k=3;
            System.out.println(k);
        }
    }
}
