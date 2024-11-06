package Codeforces;

import java.util.*;

public class Dijkstra_s_algorithm{
    static int n,min=Integer.MAX_VALUE;;
    static String sb="";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=sc.nextInt();
        Map<Integer,Integer>[]arr=new TreeMap[n+1];
        for(int i=1;i<=n;i++)arr[i]=new TreeMap<>();
        for(int i=0;i<m;i++){
            int a=sc.nextInt(),b=sc.nextInt(),l=sc.nextInt();
            arr[a].put(b,l);
            arr[b].put(a,l);
        }
        dfc(arr,new boolean[n+1],1,0,"1");
        System.out.println(sb.equals("")?-1:sb);
    }

    static void dfc(Map<Integer,Integer>[]arr,boolean[]bool,int v,int s,String p){
        if(v==n){
            if(min>s){
                min=s;
                sb=p;
            }
        }
        bool[v]=true;
        for(Map.Entry<Integer,Integer>entry:arr[v].entrySet()){
            if(!bool[entry.getKey()]){
                dfc(arr,bool,entry.getKey(),entry.getValue()+s,p+" "+entry.getKey());
            }
        }
        bool[v]=false;
    }
}