package Codeforces;

import java.util.*;

public class TCMCF_plus{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0)sb.append(arr[i]+" ");
        }
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
            if(arr[i]<0&&arr[i+1]<0)sb.append(arr[i]+" "+arr[i+1]+" ");
        }
        if(sb.length()==0)sb.append(arr[n-1]+" ");
        System.out.println(sb);
    }
}