package Codeforces;

import java.util.*;

public class Boxers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[]arr=new Integer[n];
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=1&&!set.contains(arr[i]-1))set.add(arr[i]-1);
            else if(!set.contains(arr[i]))set.add(arr[i]);
            else set.add(arr[i]+1);
        }
        System.out.println(set.size());
    }
}