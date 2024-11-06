package Codeforces;

import java.util.*;
public class Rudolph_and_121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Integer[]arr=new Integer[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            for (int i=1;i<n-1;i++){
                int min=Math.min(arr[i-1],Math.min(arr[i+1],arr[i]/2));
                arr[i-1]-=min;
                arr[i]-=min*2;
                arr[i+1]-=min;
            }
            Arrays.sort(arr);
            System.out.println(arr[0]==arr[n-1]&&arr[0]==0?"Yes":"No");
        }
    }
}