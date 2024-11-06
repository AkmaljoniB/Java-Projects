package Codeforces;

import java.util.Scanner;

public class Elections{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max,l=0;;
            long c=sc.nextInt(),a[]=new long[n];
            a[0]=(int)(sc.nextInt()+c);
            max=(int)a[0];
            c=0;
            for(int i=1;i<n;i++){
                a[i]=sc.nextInt();
                max=(int)Math.max(max,a[i]);
            }
            for(int i=0;i<n;i++){
                if(a[i]==max&&l==0){
                    System.out.print("0 ");l=1;
                }else if(a[i]+c>max)System.out.print(i+" ");
                else System.out.print(a[i]+c==max||l==1?i+" ":(i+1)+" ");
                c+=a[i];
            }
            System.out.println();
        }
    }
}