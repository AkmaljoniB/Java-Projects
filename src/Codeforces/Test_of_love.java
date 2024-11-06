package Codeforces;

import java.util.Scanner;

public class Test_of_love {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),l=0;
            char[]s=sc.next().toCharArray();
            String ans="YES";
            out:for(int i=0;i<n;i++){
                if(l==0){
                    if(i+m>n)break;
                    int q=i-1;
                    for(int j=Math.min(i+m-1,n-1);j>=i;j--){
                        if(s[j]=='L'){
                            q=j;
                            break;
                        }
                    }
                    if(q==i-1){
                        for(int j=Math.min(i+m-1,n-1);j>=i;j--){
                            if(s[j]=='W'){
                                q=j;
                                k--;
                                break;
                            }
                        }
                        if(q==i-1){
                            ans="NO";
                            break;
                        }
                        l=1;
                    }
                    i=q;
                }else{
                    for(;i<n;i++){
                        if(s[i]=='C'||k<0){
                            ans="NO";
                            break out;
                        }else if(s[i]=='W')k--;
                        else{
                            l=0;
                            break;
                        }
                    }
                }
            }
            System.out.println(k<0?"NO":ans);
        }
    }
}