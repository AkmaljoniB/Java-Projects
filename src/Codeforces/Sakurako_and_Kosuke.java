package Codeforces;

import java.util.Scanner;

public class Sakurako_and_Kosuke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(n%2==0?"Sakurako":"Kosuke");
        }
    }
}