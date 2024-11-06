package Codeforces;

import java.util.Scanner;

public class No_palindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s);
            if(s.length()==1)System.out.println("NO");
            else if(!s.contentEquals(sb.reverse())) System.out.println("YES\n1\n"+s);
            else{
                String ans="NO";
                if(!s.replace(s.substring(0,2),"").equals(s.substring(0,1))){
                    for(int i=1;i<s.length();i++){
                        while(i<s.length()-1&&s.charAt(i)==s.charAt(i-1))i++;
                        String p=s.substring(0,i+1),f=s.substring(i+1);
                        sb=new StringBuilder(p).reverse();
                        StringBuilder sb1=new StringBuilder(f).reverse();
                        if(!p.contentEquals(sb)&&!f.contentEquals(sb1)){
                            ans="YES\n2\n"+p+" "+f;
                            break;
                        }
                    }
                }
                System.out.println(ans);
            }
        }
    }
}