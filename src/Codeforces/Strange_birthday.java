package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Strange_birthday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),j=0;
            long s=0;
            int[]arr=new int[n],ars=new int[m];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt()-1;
            for(int i=0;i<m;i++)ars[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=n-1;i>=0;i--){
                if (j<m){
                    s+=Math.min(ars[arr[i]],ars[j]);
                    if(Math.min(ars[arr[i]],ars[j])==ars[j])j++;
                }else s+=ars[arr[i]];
            }
            System.out.println(s);
        }
    }
}