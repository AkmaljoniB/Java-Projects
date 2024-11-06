package Codeforces;

import java.util.Scanner;

public class MEXor_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),xor=0;
            if (a%4==1)xor=a-1;
            else if (a%4==2)xor=1;
            else if (a%4==3)xor=a;
            if ((b^xor)==a)a+=2;
            else if (b!=xor)a++;
            System.out.println(a);
        }
    }
}