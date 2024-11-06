package Codeforces;

import java.util.Scanner;

public class Message_transmission_error{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),p="NO";
        for(int i=1;i<s.length()&&s.length()-i>i;i++){
            if(s.substring(i).equals(s.substring(0,s.length()-i))){
                p="YES\n"+s.substring(0,s.length()-i);
                break;
            }
        }
        System.out.println(p);
    }
}