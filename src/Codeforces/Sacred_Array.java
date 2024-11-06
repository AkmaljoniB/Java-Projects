package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sacred_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][]arr=new int[n][n+1];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                map.put(arr[i][0],map.getOrDefault(arr[i][0],0)+1);
            }
            for(int i=1;i<=n;i++){
                for(int j=0;j<n;j++)arr[j][i]=map.get(arr[j][i-1]);
                map=new HashMap<>();
                for(int j=0;j<n;j++)map.put(arr[j][i],map.getOrDefault(arr[j][i],0)+1);
            }
            int q=sc.nextInt();
            while (q-->0) {
                int x=sc.nextInt(),k=sc.nextInt();
                System.out.println(arr[x-1][Math.min(k,n)]);
            }
        }
    }
}