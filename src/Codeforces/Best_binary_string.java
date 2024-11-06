package Codeforces;

import java.util.Scanner;

public class Best_binary_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next(),p="0";
            StringBuilder sb=new StringBuilder("");
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)!='?')p=s.charAt(i)+"";
                sb.append(p);
            }
            System.out.println(sb);
        }
    }
}