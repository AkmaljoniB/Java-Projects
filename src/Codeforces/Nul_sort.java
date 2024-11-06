package Codeforces;

import java.util.*;

public class Nul_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),n;
        while (t-->0){
            n=sc.nextInt();
            int[]arr=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            int i,p;
            for (i=n-1;i>0;i--){
                if (!map.containsKey(arr[i])) map.put(arr[i],i);
                if (arr[i-1]>arr[i])break;
            }
            p=i;
            for (int j=0;j<i; j++) if (map.containsKey(arr[j]))p=Math.max(p,map.get(arr[j]));
            Set<Integer>set=new HashSet<>();
            for (int j=0;j<p;j++)set.add(arr[j]);
            System.out.println(set.size());
        }
    }
}