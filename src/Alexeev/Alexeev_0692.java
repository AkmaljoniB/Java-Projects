package Alexeev;

import java.util.Scanner;

public class Alexeev_0692 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int d=0;
        for (int i = 0; i<=13;i++){
            if (Math.pow(2,i)==n){
                System.out.println("YES");
                d++;
            } else if (d!=1 && i==13){
                System.out.println("NO");
            }
        }
    }
}
