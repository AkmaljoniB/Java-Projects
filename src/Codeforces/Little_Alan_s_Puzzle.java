package Codeforces;

import java.util.*;

public class Little_Alan_s_Puzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,num[]=new int[n];
            List<Integer>[]arr=new List[n+1];
            boolean[]bool=new boolean[n+1];
            for(int i=1;i<=n;i++)arr[i]=new ArrayList<>();
            for(int i=0;i<n;i++)num[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                arr[num[i]].add(a);
                arr[a].add(num[i]);
            }
            for(int i=1;i<=n;i++){
                if(!bool[i]){
                    int j=i,p=-1;
                    while(true){
                        bool[j]=true;
                        if(!bool[arr[j].get(0)]&&arr[j].get(0)!=p){
                            p=j;
                            j=arr[j].get(0);
                        } else if(!bool[arr[i].get(1)]){
                            p=j;
                            j=arr[j].get(1);
                        }else break;
                    }
                    l++;
                }
            }
            long p=2;
            for(int i=1;i<l;i++)p=(p*2)%1000000007;
            System.out.println(p);
        }
    }
}