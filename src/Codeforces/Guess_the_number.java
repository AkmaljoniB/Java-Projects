package Codeforces;

import java.util.Scanner;

public class Guess_the_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine()),l=-(int)Math.pow(10,9)-1,r=-l;
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            int p=s.contains("=")?1:0,a=Integer.parseInt(s.substring(2+p,s.length()-2));
            if(s.endsWith("Y")){
                if(s.startsWith(">="))l=Math.max(l,a);
                else if(s.startsWith(">"))l=Math.max(l,a+1);
                if(s.startsWith("<="))r=Math.min(r,a);
                else if(s.startsWith("<"))r=Math.min(r,a-1);
            }else{
                if(s.startsWith(">="))r=Math.min(r,a-1);
                else if(s.startsWith(">"))r=Math.min(r,a);
                if(s.startsWith("<="))l=Math.max(l,a+1);
                else if(s.startsWith("<"))l=Math.max(l,a);
            }
        }
        System.out.println(l>r?"Impossible":l);
    }
}