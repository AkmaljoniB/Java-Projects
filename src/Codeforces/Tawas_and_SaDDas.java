package Codeforces;

import java.util.Scanner;

public class Tawas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),k=0,o=1;
        while(n>3) {
            if (n%10==4)k+=o;
            else k+=o*2;
            o*=2;
            n/=10;
        }
        System.out.println(k);
    }
}