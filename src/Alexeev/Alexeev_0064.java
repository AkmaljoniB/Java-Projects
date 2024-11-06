package Alexeev;

import java.util.Scanner;

public class Alexeev_0064{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),l=3;
        String s="2";
        while(m-->0){
            int n=sc.nextInt();
            while(n>s.length()){
                int o=0;
                for(int i=2;i<=l/2;i++){
                    if(l%i==0){
                        o++;
                        break;
                    }
                }
                if(o==0)s=s+l;
                l++;
            }
            System.out.print(s.charAt(n-1));
        }
    }
}