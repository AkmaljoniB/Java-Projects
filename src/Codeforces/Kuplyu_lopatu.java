package Codeforces;

import java.util.Scanner;

public class Kuplyu_lopatu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k =scanner.nextInt();
        int r =scanner.nextInt();
        int n=1,l =k;
        while (k%10!=0 || k%10-r!=0){
            if (k%10==0||k%10-r==0){
                break;
            }
            n++;
            k+=l;
        }
        System.out.println(n);
    }
}