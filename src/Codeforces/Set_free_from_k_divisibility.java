package Codeforces;

import java.util.*;

public class Set_free_from_k_divisibility{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        Set<Integer>set=new HashSet<>();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n;i++)if(arr[i]%k!=0||!set.contains(arr[i]/k))set.add(arr[i]);
        System.out.println(set.size());
    }
}