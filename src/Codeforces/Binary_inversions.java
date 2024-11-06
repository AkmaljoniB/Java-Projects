package Codeforces;

import java.util.Scanner;

public class Binary_inversions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,r=0,j=0;
            long s1=0,s2=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==1){
                    l++;
                    j=i;
                }else{
                    if(r==0){
                        l++;
                        r=1;
                    }else s1+=l;
                    s2+=l-1;
                }
            }
            long max=Math.max(s1,s2);
            s2=s2-n+j+1+(l-2);
            if(r==0)s2++;
            System.out.println(Math.max(max,s2));
        }
    }
}