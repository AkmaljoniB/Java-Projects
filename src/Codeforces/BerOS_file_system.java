package Codeforces;

import java.util.Scanner;

public class BerOS_file_system{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        while(s.contains("//"))s=s.replace("//","/");
        System.out.println(s.length()!=1&&s.charAt(s.length()-1)=='/'?s.substring(0,s.length()-1):s);
    }
}