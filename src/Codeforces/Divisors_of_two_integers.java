package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Divisors_of_two_integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        for (int i = n-2; i>=0;i--) {
            if (arr[n-1]%arr[i]!=0||(arr[i]==arr[i+1])) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
