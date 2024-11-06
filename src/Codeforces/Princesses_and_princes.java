package Codeforces;

import java.util.Scanner;

public class Princesses_and_princes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),num[]=new int[n],arr[]=new int[n+1],l=0;
            for(int i=0;i<n;i++){
                int k=sc.nextInt();
                for(int j=0;j<k;j++){
                    int g=sc.nextInt();
                    if(num[i]==0&&arr[g]==0)l+=num[i]=arr[g]=1;
                }
            }
            if(l==n)System.out.println("OPTIMAL");
            else{
                System.out.println("IMPROVE");
                out:for(int i=0;i<n;i++){
                    if(num[i]==0){
                        System.out.print(i+1);
                        for(int j=1;j<=n;j++){
                            if(arr[j]==0){
                                System.out.println(" "+j);
                                break out;
                            }
                        }
                    }
                }
            }
        }
    }
}