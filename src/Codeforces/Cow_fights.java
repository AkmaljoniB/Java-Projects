package Codeforces;

import java.util.Scanner;

public class Cow_fights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),f=-1,l2=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++) {
                if(arr[i]>arr[k-1]){
                    f=i;
                    break;
                }
            }
            if(f!=-1){
                if(f!=0&&n!=2&&k!=1)l2++;
                for(int i=f+1;i<k;i++){
                    if(arr[i]<arr[k-1])l2++;
                    else break;
                }
            }else f=n;
            System.out.println(Math.max(Math.max(f-1,0),l2));
        }
    }
}