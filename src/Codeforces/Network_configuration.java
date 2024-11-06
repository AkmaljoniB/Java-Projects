package Codeforces;

import java.util.*;

public class Network_configuration{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[n-k]);
    }
}