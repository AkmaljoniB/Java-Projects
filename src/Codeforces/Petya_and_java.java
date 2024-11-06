package Codeforces;

import java.util.Scanner;

public class Petya_and_java{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),p="BigInteger";
        try{
            long n=Long.parseLong(s);
            if(n<=127)p="byte";
            else if(n<=32767)p="short";
            else if (n<=2147483647)p="int";
            else p="long";
        }catch(Exception ex){}
        System.out.println(p);
    }
}