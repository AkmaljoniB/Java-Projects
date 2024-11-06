package Alexeev;

import java.util.*;

public class Alexeev_0124{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        List<Integer>[]arr=new List[n+1];
        for(int i=1;i<=n;i++)arr[i]=new ArrayList<>();
        for(int i=0;i<m;i++){
            int a=sc.nextInt(),b=sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        for(int i=1;i<=n;i++)System.out.print(arr[i].size()+" ");
    }
}