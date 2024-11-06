package Codeforces;

import java.util.Scanner;

public class Petya_and_origami {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int s= (int) ((n*2)/k+(n*5)/k+(n*8)/k);
        if ((n*2)%k!=0)s++;
        if ((n*5)%k!=0)s++;
        if ((n*8)%k!=0)s++;
        System.out.println(s);
    }
}
