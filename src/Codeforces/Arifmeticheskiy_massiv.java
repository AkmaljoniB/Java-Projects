package Codeforces;

import java.util.Scanner;

public class Arifmeticheskiy_massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        for (int i = 0 ; i <t;i++){
            int n =scanner.nextInt();
            int s=0;
            for (int j = 0 ; j <n;j++){
                int a=scanner.nextInt();
                s+=a;
            }
            if (s-n<0){
                System.out.println(1);
            } else {
                System.out.println(s-n);
            }
        }
    }
}
