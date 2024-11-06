package Alexeev;

import java.util.Scanner;

public class Alexeev_0780 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int k = 1 ;
        while (x>0){
            x-=k;
            k++;
        }
        System.out.println(k-1);
    }
}
