package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0461{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n/2+1;i++)k+=arr[i]/2+1;
        System.out.println(k);
    }
}
