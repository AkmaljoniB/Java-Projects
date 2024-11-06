package Codeforces;

import java.util.*;

public class K_sort {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n],l=0;
            long s=0;
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=1;i<n;i++){
                if(arr[l]>arr[i])list.add(arr[l]-arr[i]);
                else l=i;
            }
            l=0;
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                s+=(long)(list.get(i)-l)*(list.size()+1-i);
                l+=list.get(i)-l;
            }
            System.out.println(s);
        }
    }
}