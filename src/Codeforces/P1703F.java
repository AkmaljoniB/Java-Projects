package Codeforces;

import java.util.*;

public class P1703F{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<int[]>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(i>=a)list.add(new int[]{a,i+1});
            }
            List<Integer>a=new ArrayList<>();
            for(int i=1;i<list.size();i++){
                if(list.get(i)[0]>list.get(0)[1])a.add(list.get(i)[0]);
            }
            Collections.sort(a);
            int l=a.size();
            long k=l;
            for(int i=1;i<list.size();i++){
                for(int j=a.size()-l;j<a.size();j++){
                    if(a.get(j)<=list.get(i)[1])l--;
                    else break;
                }
                k+=l;
                if(l<1)break;
            }
            System.out.println(k);
        }
    }
}