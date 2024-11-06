package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Save_more_mice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int k =scanner.nextInt();
            Integer[]arr = new Integer[k];
            for (int i = 0 ; i<k;i++)arr[i]=scanner.nextInt();
            Arrays.sort(arr);
            int p =0,l=0;
            for (int i =k-1;i>=0;i--){
                if (p<arr[i]){
                    l++;
                    p+=n-arr[i];
                } else break;
            }
            System.out.println(l);
        }
    }
}
