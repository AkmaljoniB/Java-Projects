package Codeforces;

import java.util.*;

public class Linova_and_the_kingdom{
    static List<Integer>[]arr;
    static int dep[],size[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        arr=new List[n];
        for(int i=0;i<n;i++)arr[i]=new ArrayList<>();
        for(int i=1;i<n;i++){
            int u=sc.nextInt()-1,v=sc.nextInt()-1;
            arr[u].add(v);
            arr[v].add(u);
        }
        dep=new int[n];
        size=new int[n];
        dfs(0,-1);
        for(int i=0;i<n;i++)size[i]=size[i]-dep[i];
        Arrays.sort(size);
        long sum=0;
        for(int i=size.length-1;i>=size.length-k;i--)sum+=size[i];
        System.out.println(sum);
    }
    static void dfs(int j,int p){
        size[j]++;
        if(p!=-1)size[j]+=size[p];
        dep[j]=1;
        for(int i:arr[j]){
            if(i!=p){
                dfs(i,j);
                dep[j]+=dep[i];
            }
        }
    }
}