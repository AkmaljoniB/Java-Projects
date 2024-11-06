package Codeforces;

import java.util.Scanner;

public class Card_pyramids {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int k=0;
            while (n>1){
                int l =2,p=5;
                while (l+p<=n){
                    l+=p;
                    p+=3;
                }
                n-=l;
                k++;
            }
            System.out.println(k);
        }
    }
}
//2 7 15 26