package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kefa_and_park {
    static int m,k=0,arr[];
    static boolean used[];
    static List<Integer>[]num;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n+1];
        num=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
            num[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            int l=sc.nextInt(),r=sc.nextInt();
            num[r].add(l);
            num[l].add(r);
        }
        func(1,arr[1]);
        System.out.println(k);
    }
    public static void func(int n,int s){
        for(int i=0;i<num[n].size();i++){
            if(num[n].size()!=0){
                int b=(s+1)*arr[num[n].get(i)];
                if(b<=m){
                    num[num[n].get(i)].remove((Object)n);
                    func(num[n].get(i),b);
                }
            }
        }
        if(num[n].size()==0)k++;
    }
}