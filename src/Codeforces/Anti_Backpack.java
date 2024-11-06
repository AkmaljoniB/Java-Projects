package Codeforces;

import java.util.Scanner;

public class Anti_Backpack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(n-k+k/2);
            for (int i = k+1;i<=n;i++) System.out.print(i+" ");
            for (int i =k/2+k%2;i<k;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
