package Codeforces;

import java.util.Scanner;

public class Phone_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        for (int i=0; i < n-3; i+=2) System.out.print(s.substring(i,i+2)+"-");
        if (s.length()%2!=0) System.out.println(s.substring(s.length()-3));
        else System.out.println(s.substring(s.length()-2));
    }
}
