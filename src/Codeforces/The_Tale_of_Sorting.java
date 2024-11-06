package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class The_Tale_of_Sorting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int[]arr = new int[n];
            int[]sort = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=scanner.nextInt();
                sort[i]=arr[i];
            }
            Arrays.sort(sort);
            int p = 0;
            for (int i = n-1;i>=0;i--){
                if (arr[i]!=sort[i]){
                    p =sort[i];
                    break;
                }
            }
            System.out.println(p);
        }
    }
}
