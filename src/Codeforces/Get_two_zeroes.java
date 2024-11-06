package Codeforces;

import java.util.Scanner;

public class Get_two_zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt();
            System.out.println(a*2>=b && b*2>=a &&(a+b)%3==0?"YES":"No");
        }
    }
}
