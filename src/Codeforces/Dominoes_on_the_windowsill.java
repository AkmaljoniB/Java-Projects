package Codeforces;

import java.util.Scanner;

public class Dominoes_on_the_windowsill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k1=sc.nextInt(),k2=sc.nextInt(),w=sc.nextInt(),b=sc.nextInt();
            System.out.println(k1+k2>=w*2 && n-k1+n-k2>=b*2?"YES":"NO");
        }
    }
}