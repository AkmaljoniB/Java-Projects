package Codeforces.EDU;

import java.util.Scanner;

public class Z2_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            int l=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-i))l++;
                else break;
            }
            System.out.print(i==0?"0 ":l+" ");
        }
    }
}