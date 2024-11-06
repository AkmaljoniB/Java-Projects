package Codeforces;

import java.util.Scanner;

public class Manhattan_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),l=0;
            String p="",arr[]=new String[n+1];
            for(int i=0;i<=n;i++){
                if(i!=n)arr[i]=sc.next();
                else arr[i]="";
                if(p.length()==0&&arr[i].length()-arr[i].replace("#","").length()<l){
                    p=i+" "+((l+1)/2+arr[i-1].indexOf("#"));
                }
                l=arr[i].length()-arr[i].replace("#","").length();
            }
            System.out.println(p);
        }
    }
}