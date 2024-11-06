package Codeforces;

import java.util.Scanner;

public class Eating_Soup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(Math.min(Math.max(m,1), n - m));
    }
}