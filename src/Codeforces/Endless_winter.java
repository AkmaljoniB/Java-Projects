package Codeforces;

import java.util.*;

public class Endless_winter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            List<Integer>[]arr=new List[n+1];
            for(int i=1;i<=n;i++)arr[i]=new ArrayList<>();
            for(int i=0;i<m;i++){
                int u=sc.nextInt(),v=sc.nextInt();
                arr[u].add(v);
                arr[v].add(u);
            }
            out:for(int i=1;i<=n;i++){
                if(arr[i].size()==1){
                    for(int j=0;j<arr[arr[i].get(0)].size();j++){
                        if(arr[arr[arr[i].get(0)].get(j)].size()!=1){
                            System.out.println(arr[arr[arr[i].get(0)].get(j)].size()+" "+ (arr[arr[i].get(0)].size()-1));
                            break out;
                        }
                    }
                }
            }
        }
    }
}