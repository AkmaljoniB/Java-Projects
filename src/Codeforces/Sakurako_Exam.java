package Codeforces;

import java.util.Scanner;

public class Sakurako_Exam{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println(a%2==0&&(b%2==0||a>1)?"YES":"NO");
        }
    }
}