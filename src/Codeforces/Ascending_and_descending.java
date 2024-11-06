package Codeforces;

import java.util.Scanner;

public class Ascending_and_descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int x =scanner.nextInt();
            int y =scanner.nextInt();
            int n =scanner.nextInt();
            if (y-x<n*(n-1)/2) System.out.println(-1);
            else {
                int[]arr = new int[n];
                arr[n-1]=y;
                arr[0]=x;
                int k=1;
                for (int i = n-2; i >0 ; i--) {
                    arr[i]=arr[i+1]-k;
                    k++;
                }
                for (int i = 0; i <n ; i++) System.out.print(arr[i]+" ");
                System.out.println();
            }
        }
    }
}
