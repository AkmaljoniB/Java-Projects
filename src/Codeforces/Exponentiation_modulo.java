package Codeforces;

import java.util.*;

public class Exponentiation_modulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(m%((int)Math.pow(2,n)));
    }
}