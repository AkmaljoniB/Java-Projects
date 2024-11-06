package Alexeev;

import java.util.Scanner;

public class Alexeev_0164{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),ans="NO";
        for(int i=1;i<s.length();i++){
            int l=0,p=0;
            for(int j=0;j<i;j++)l+=s.charAt(j)-'0';
            for(int j=i;j<s.length();j++)p+=s.charAt(j)-'0';
            while(l>9||p>9){
                int q=0,w=0;
                while(l>0){
                    q+=l%10;
                    l/=10;
                }
                while(p>0){
                    w+=p%10;
                    p/=10;
                }
                l=q;
                p=w;
            }
            if(l==p){
                ans="YES";
                break;
            }
        }
        System.out.println(ans);
    }
}
//0101010010101