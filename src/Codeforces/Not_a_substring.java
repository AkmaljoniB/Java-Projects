package Codeforces;

import java.util.Scanner;

public class Not_a_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next(),p="";
            for (int i=0;i<s.length();i++)p+="()";
            if (p.contains(s)){
                p="";
                for (int i=0;i<s.length();i++)p+="(";
                for (int i=0;i<s.length();i++)p+=")";
                if (p.contains(s)) System.out.println("NO");
                else System.out.println("YES\n"+p);
            }else System.out.println("YES\n"+p);
        }
    }
}