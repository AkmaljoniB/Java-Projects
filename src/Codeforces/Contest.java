package Codeforces;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=Math.max(a*3/10,a-a/250*sc.nextInt()),d=Math.max(b*3/10,b-b/250*sc.nextInt());
        if (c==d) System.out.println("Tie");
        else System.out.println(c>d?"Misha":"Vasya");
    }
}