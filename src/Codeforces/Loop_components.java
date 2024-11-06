package Codeforces;

import java.util.*;

public class Loop_components{
    static int k=0;
    static boolean[]bool;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        List<Integer>[]arr=new List[n+1];
        for(int i=1;i<=n;i++)arr[i]=new ArrayList<>();
        for(int j=0;j<m;j++){
            int l=sc.nextInt(),r=sc.nextInt();
            arr[l].add(r);
            arr[r].add(l);
        }
        bool=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(arr[i].size()!=0)dfc(arr,i,i,1);
        }
        System.out.println(k);
    }
    static void dfc(List<Integer>[]arr,int l,int e,int prev){
        if(arr[l].size()>2)return;
        bool[l]=true;
        for(int i=0;i<arr[l].size();i++){
            if(!bool[arr[l].get(i)]){
                dfc(arr,arr[l].get(i),e,l);
            }else if(arr[l].get(i)==e&&arr[l].get(i)!=prev)k++;
        }
    }
}