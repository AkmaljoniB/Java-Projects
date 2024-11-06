package Codeforces;

import java.util.*;

public class Geometric_progression{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),arr[]=new int[n];
        long s=0;
        Map<Integer,Integer>l=new HashMap<>(),r=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            r.put(arr[i],r.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            r.put(arr[i],r.get(arr[i])-1);
            if(arr[i]%k==0&&l.containsKey(arr[i]/k)&&arr[i]*k==(long)arr[i]*k&&r.containsKey(arr[i]*k))s+=(long)l.get(arr[i]/k)*r.get(arr[i]*k);
            l.put(arr[i],l.getOrDefault(arr[i],0)+1);
        }
        System.out.println(s);
    }
}