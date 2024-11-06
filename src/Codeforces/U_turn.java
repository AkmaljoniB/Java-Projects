package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class U_turn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr =new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[]arr=new Integer[n+1];
            int l = 0, r = 0,k=0;
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                if (a != i && l == 0) l = i;
                if (a == l && r == 0) r = i;
                arr[i]=a;
            }
            for (int i = 1; i <= n; i++) {
                if (i >= l && i <= r) {
                    pr.print(arr[r-k]+" ");
                    k++;
                } else pr.print(arr[i] + " ");
            }
            pr.println();
        }
        pr.close();
    }
}