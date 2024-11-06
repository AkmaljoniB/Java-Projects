package Codeforces;

import java.util.Scanner;

public class Skuchniye_kvartiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int s = (x % 10 - 1) * 10;
            if (x<10){
                s+=1;
            } else if (x>10 && x<100){
                s+=3;
            } else if (x>100 && x<1000){
                s+=6;
            } else {
                s+=10;
            }
            System.out.println(s);
        }
    }
}