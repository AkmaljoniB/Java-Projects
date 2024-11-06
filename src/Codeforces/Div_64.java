package Codeforces;

import java.util.Scanner;

public class Div_64 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        if (!a.contains("1"))a="";
        else a=a.substring(a.indexOf("1"));
        System.out.println(a.replace("1","").length()>5?"yes":"no");
    }
}