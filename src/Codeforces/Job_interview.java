package Codeforces;

import java.util.Scanner;

public class Job_interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),l=n+m+1,q=n,w=m;
            int[]a=new int[l],b=new int[l],c=new int[l];
            long s=0;
            for(int i=0;i<l;i++)a[i]=sc.nextInt();
            for(int i=0;i<l;i++){
                b[i]=sc.nextInt();
                if(i>0){
                    if((q>0&&a[i]>b[i])||w==0){
                        q--;
                        s+=a[i];
                        c[i]=1;
                    }else{
                        w--;
                        s+=b[i];
                        c[i]=2;
                    }
                }
            }
            System.out.print(s+" ");
            q=n;
            w=m;
            for(int i=0;i<l-1;i++){
                if((q>0&&a[i]>b[i])||w==0){
                    q--;
                    s+=a[i];
                    if(c[i+1]==1)s-=a[i+1];
                    else{
                        s-=b[i+1];
                        int r=1;
                        for(int j=i+2;j<l;j++){
                            if(c[j]==r){
                                if(a[j]>b[j]){
                                    s=s+a[j]-b[j];
                                    r=c[j]=1;
                                }
                            }else{
                                if(a[j]<b[j]){
                                    s=s-a[j]+b[j];
                                    r=c[j]=2;
                                }
                            }
                        }
                    }
                }else{
                    w--;
                    s+=b[i];
                    if(c[i+1]==2)s-=b[i+1];
                    else{
                        s-=a[i+1];
                        int r=2;
                        for(int j=i+2;j<l;j++){
                            if(c[j]==r){
                                if(a[j]>b[j]){
                                    s=s+a[j]-b[j];
                                    r=c[j]=1;
                                }
                            }else{
                                if(a[j]<b[j]){
                                    s=s-a[j]+b[j];
                                    r=c[j]=2;
                                }
                            }
                        }
                    }
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}