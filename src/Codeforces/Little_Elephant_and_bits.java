package Codeforces;

import java.util.Scanner;

public class Little_Elephant_and_bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (s.contains("0")) System.out.println(s.substring(0,s.indexOf("0"))+s.substring(s.indexOf("0")+1));
        else System.out.println(s.substring(1));
    }
}