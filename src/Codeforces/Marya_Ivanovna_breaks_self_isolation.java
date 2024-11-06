package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Marya_Ivanovna_breaks_self_isolation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            int n =  scanner.nextInt();
            Integer[]arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
            Arrays.sort(arr);
            int k=1;
            for (int i = n-1; i >=0; i--) {
                if (arr[i]<=i+1) {
                    k = i+2;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}
