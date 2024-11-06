package Codeforces;

import java.util.*;

public class Binary_split{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int k=s.contains("01")?0:1;
            for(int i=0;i<s.length()-1;i++)if(s.charAt(i)!=s.charAt(i+1))k++;
            System.out.println(k);
        }
    }
}