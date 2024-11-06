package Codeforces;

import java.util.*;

public class Mr_Kitayut_s_Color_Count {
    static List<int[]>[]arr;
    static Set<Integer>set=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        arr=new List[n+1];
        for(int i=1;i<=n;i++)arr[i]=new ArrayList<>();
        while(m-->0){
            int u=sc.nextInt(),v=sc.nextInt(),c=sc.nextInt();
            arr[u].add(new int[]{v,c});
            arr[v].add(new int[]{u,c});
        }
        int q=sc.nextInt();
        while(q-->0){
            int u=sc.nextInt(),v=sc.nextInt();
            set=new HashSet<>();
            if(arr[u].size()<arr[v].size())dfs(u,v,0,new boolean[n+1]);
            else dfs(v,u,0,new boolean[n+1]);
            System.out.println(set.size());
        }
    }
    static void dfs(int u,int v,int c,boolean[]bool){
        bool[u]=true;
        for(int i=0;i<arr[u].size();i++){
            if(!bool[arr[u].get(i)[0]]&&(arr[u].get(i)[1]==c||c==0)){
                if(arr[u].get(i)[0]==v)set.add(arr[u].get(i)[1]);
                else dfs(arr[u].get(i)[0],v,arr[u].get(i)[1],bool);
            }
        }
        bool[u]=false;
    }
}