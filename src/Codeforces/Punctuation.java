package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Punctuation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        String s=sc.nextLine(),p="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'a'>=0&&s.charAt(i)-'a'<26){
                pr.print(p+s.charAt(i));
                p="";
            }else if(p.length()<2){
                p=" ";
                if(s.charAt(i)!=' ')p=s.charAt(i)+" ";
            }
        }
        pr.close();
    }
}