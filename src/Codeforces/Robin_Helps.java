package Codeforces;

import java.util.Scanner;

public class Robin_Helps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),s=0,l=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a>=k)s+=a;
                else if(s!=0&&a==0){
                    s--;
                    l++;
                }
            }
            System.out.println(l);
        }
    }
}