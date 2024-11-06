package Codeforces;

import java.util.*;

public class Ehab_divides_the_array_again{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)s+=arr[i]=sc.nextInt();
        if(canPartition(arr,s)){
            Set<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++){
                int l=arr[i];
                if(!set.contains(l)){
                    arr[i]=0;
                    if(!canPartition(arr,s-l)){
                        System.out.print("1\n"+(i+1));
                        break;
                    }
                    arr[i]=l;
                    set.add(l);
                }
            }
        }else System.out.println(0);
    }
    public static boolean canPartition(int[]arr,int sum){
        if(sum%2!=0)return false;
        int tSum=sum/2;
        boolean[]dp=new boolean[tSum+1];
        dp[0]=true;
        for(int i=0;i<arr.length;i++){
            for(int j=tSum;j>=arr[i];j--){
                dp[j]=dp[j]||dp[j-arr[i]];
            }
        }
        return dp[tSum];
    }
}