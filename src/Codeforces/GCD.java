package Codeforces;

import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<=n;i++){
                if(l%i==0)sb.append(l+" ");
                else if(l+i-l%i<=r)sb.append(l+i-l%i +" ");
                else{
                    sb=new StringBuilder();
                    break;
                }
            }
            System.out.println(sb.length()==0?"NO":"YES\n"+sb);
        }
    }
}