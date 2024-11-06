package Alexeev;

import java.util.Scanner;

public class Alexeev_0892 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w==1 || w==2 || w==12){
            System.out.println("Winter");
        } else if (w>=3 && w<=5){
            System.out.println("Spring");
        } else if (w>=6 && w<=8){
            System.out.println("Summer");
        } else if (w>=9 && w<=11){
            System.out.println("Autumn");
        } else {
            System.out.println("Error");
        }
    }
}
