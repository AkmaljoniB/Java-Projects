package Codeforces;

import java.util.Scanner;

public class Make_it_equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),p=0;
            long s=0;
            int[]arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            String f="YES";
            for (int i=0;i<n;i++) {
                if (arr[i]<s/n)p-=s/n-arr[i];
                else p+=arr[i]-s/n;
                if (p<0){
                    f="NO";
                    break;
                }
            }
            System.out.println(f);
        }
    }
}
