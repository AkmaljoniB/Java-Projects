package Codeforces;

import java.util.Scanner;

public class One_lift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            String s ="YES";
            int p =0,l=0;
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int a=scanner.nextInt();
                if (a!=arr[i]){
                    if (l!=0 && p!=0)s="NO";
                    if (p==0)p=a-arr[i];
                    if (p!=a-arr[i]||p<0)s="NO";
                    l=0;
                }else l++;
            }
            if (p<0)s="NO";
            System.out.println(s);
        }
    }
}
