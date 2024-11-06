package Codeforces;

import java.util.Scanner;

public class BowWow_and_schedule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0;
        if(s.length()%2!=0&&s.substring(1).contains("1"))a++;
        System.out.println(a+s.length()/2);
    }
}