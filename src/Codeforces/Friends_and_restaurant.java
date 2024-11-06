package Codeforces;

import java.util.*;

public class Friends_and_restaurant{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,r=n-1,k=0;
            int[]arr=new int[n];
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++)list.add(sc.nextInt()-arr[i]);
            Collections.sort(list);
            while(l<r){
                if(list.get(l)+list.get(r)>=0){
                    k++;
                    r--;
                }
                l++;
            }
            System.out.println(k);
        }
    }
}