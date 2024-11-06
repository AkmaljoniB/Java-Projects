package Codeforces;

import java.util.Scanner;

public class Game_in_permutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),pb=sc.nextInt(),ps=sc.nextInt(),l=0;
            int[]p=new int[n+1],a=new int[n+1];
            for(int i=1;i<=n;i++)p[i]=sc.nextInt();
            for(int i=1;i<=n;i++)a[i]=sc.nextInt();
            int q1=pb,q2=ps;
            long s1=a[pb],s2=a[ps],max1=s1*k,max2=s2*k;
            for(int i=1;i<k;i++){
                q1=p[q1];
                max1=Math.max(max1,s1+(long)a[q1]*(k-i));
                s1+=a[q1];
                q2=p[q2];
                max2=Math.max(max2,s2+(long)a[q2]*(k-i));
                s2+=a[q2];
                if(q1==pb)l=1;
                if(q2==ps&&l==1)break;
            }
            System.out.println(max1>max2?"Bodya":max2>max1?"Sasha":"Draw");
        }
    }
}