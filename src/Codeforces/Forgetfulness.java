package Codeforces;

import java.util.Scanner;

public class Forgetfulness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt(),d2=sc.nextInt();
        if (d2-d1==1||d2-d1==0)System.out.println(d1==d2?d1+"0 "+d2+"1":d1+"9 "+d2+"0");
        else System.out.println(d1==9 && d2==1?"9 10":-1);
    }
}