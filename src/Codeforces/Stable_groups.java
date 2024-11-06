package Codeforces;

import java.util.*;

public class Stable_groups {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong(),x=sc.nextLong();
        Long[]arr=new Long[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextLong();
        Arrays.sort(arr);
        List<Long>list=new LinkedList<>();
        for (int i=1;i<n;i++)if (arr[i]-arr[i-1]>x)list.add((arr[i]-arr[i-1]-1)/x);
        Collections.sort(list);
        while (list.size()>0&&k-list.get(0)>=0){
            k-=list.get(0);
            list.remove(0);
        }
        System.out.println(list.size()+1);
    }
}