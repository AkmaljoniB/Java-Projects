package Russ_olympic.Region_1;

import java.util.Scanner;

public class Obuchenie_Shaxmatam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 =scanner.nextInt();
        int y1 =scanner.nextInt();
        int x2 =scanner.nextInt();
        int y2 =scanner.nextInt();
        if ((x1+y1) %2 != (x2+y2) %2){
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(2);
            for (int i = 0; i <64 ; i++){
                int y3 = i / 8 +1;
            }
            System.out.println(x2 + " "+ y2);
        }
    }
}
