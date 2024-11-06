package Codeforces.EDU;

import java.util.Scanner;

public class Z1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=0;
            for(int i=1;i<s.length();i++){
                if(!s.substring(0,i).equals(s.substring(s.length()-i))){
                    for(int j=i;j<=s.length();j++){
                        if(s.substring(j-i,j).equals(s.substring(0,i)))l++;
                        if(s.substring(j-i,j).equals(s.substring(s.length()-i)))l++;
                    }
                }
            }
            System.out.println(l);
        }
    }
}