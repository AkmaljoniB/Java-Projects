package Codeforces;

import java.util.Scanner;

public class Phoenix_and_gold {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),sum=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if (sum==x) System.out.println("NO");
            else {
                System.out.println("YES");
                sum=0;
                int k=-1;
                for(int i=1;i<n;i++){
                    sum+=arr[i];
                    if (sum!=x) System.out.print(arr[i]+" ");
                    else {
                        k=0;
                        sum+=arr[0];
                        System.out.print(arr[0]+" "+arr[i]+" ");
                    }
                }
                if(k==-1) System.out.print(arr[0]+" ");
                System.out.println();
            }
        }
    }
}