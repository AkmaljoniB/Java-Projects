package Codeforces;

import java.util.Scanner;

public class Wallet_exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t =sc.nextInt();t-->0;){
            System.out.println((sc.nextInt()+sc.nextInt())%2==0?"Bob":"Alice");
        }
    }
}
