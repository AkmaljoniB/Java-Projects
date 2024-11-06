package Codeforces;

import java.util.Scanner;

public class Problematic_sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            Integer[]arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
            int l=0,k=0;
            for (int i = 0; i < n; i++) {
                if (scanner.nextInt()==1)l++;
                else k++;
            }
            if (l!=0 &&k!=0) System.out.println("Yes");
            else {
                String b="Yes";
                for (int i = 0; i < n-1; i++) {
                    if (arr[i]>arr[i+1]){
                        b="No";
                        break;
                    }
                }
                System.out.println(b);
            }
        }
    }
}
