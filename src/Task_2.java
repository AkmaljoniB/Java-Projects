import java.util.ArrayList;
import java.util.Scanner;

public class Task_2{
    static ArrayList<Integer>[] adj;
    static int dep[],size[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        tree(n,sc);
        dfs(0,-1);
        for(int i=0;i<n;i++) dep[i]=dep[i]-size[i]+1;
        java.util.Arrays.sort(dep);
        long sum=0;
        for(int i=dep.length-1;i>=dep.length-k;i--) sum+=dep[i];
        System.out.println(sum);
    }
    static void tree(int n, Scanner sc) {
        adj=new ArrayList[n];
        dep=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++) adj[i]=new ArrayList<>();
        while(n-->1) {
            int a=sc.nextInt()-1,b=sc.nextInt()-1;
            adj[a].add(b);
            adj[b].add(a);
        }
    }
    static void dfs(int start,int pre) {
        size[start]++;
        for(int i:adj[start]) {
            if(i!=pre) {
                dep[i]=dep[start]+1;
                dfs(i,start);
                size[start]+=size[i];
            }
        }
    }
}