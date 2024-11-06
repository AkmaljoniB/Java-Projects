package Alexeev;

import java.util.Scanner;

public class Alexeev_0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n<0?-((1-n)*(-n)/2-1):(1+n)*n/2);
    }
}