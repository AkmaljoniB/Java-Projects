package Codeforces;

import java.util.Scanner;

public class Incorrect_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next(),s=sc.next(),p="";
            int l=a.length()-1,r=s.length()-1;
            while(l>=0&&r>=0){
                if(s.charAt(r)>=a.charAt(l))p=s.charAt(r)-a.charAt(l)+p;
                else{
                    if(r==0||s.charAt(r-1)!='1'){
                        p="-1";
                        break;
                    }
                    int q=Integer.parseInt(s.substring(r-1,r+1))-(a.charAt(l)-'0');
                    p=q+p;
                    r--;
                }
                r--;
                l--;
            }
            if(l!=-1)p="-1";
            else if (r!=-1)p=s.substring(0,r+1)+p;
            System.out.println(Long.parseLong(p));
        }
    }
}