package Codeforces;

import java.util.Scanner;

public class XORinacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
            if (n%3==2) System.out.println(a^b);
            else if (n%3==1) System.out.println(b);
            else System.out.println(a);
        }
    }
}
