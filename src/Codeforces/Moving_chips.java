package Codeforces;

import java.util.Scanner;

public class Moving_chips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int j=0,t=0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt()%2==0)j++;
            else t++;
        }
        System.out.println(Math.min(t,j));
    }
}