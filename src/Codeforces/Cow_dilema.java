package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cow_dilema {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++)for(int j=i+1;j<n;j++) set.add(arr[j]-arr[i]);
            System.out.println(set.size());
        }
    }
}
