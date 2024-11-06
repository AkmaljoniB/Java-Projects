package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Massive_cloning_technique {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int[]arr = new int[n];
            for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
            int max = 0,l=0,k=0;
            Arrays.sort(arr);
            for (int i = 1; i < n; i++) {
                if (arr[i]==arr[i-1])l++;
                else {
                    max = Math.max(max,l+1);
                    l=0;
                }
            }
            max= Math.max(max,l+1);
            l=n-max;
            if (max==n) System.out.println(0);
            else {
                while (l>0) {
                    k += Math.min(l, max);
                    l -= Math.min(l, max);
                    k++;
                    max += max;
                }
                System.out.println(k);
            }
        }
    }
}
