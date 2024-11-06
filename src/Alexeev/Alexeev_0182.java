package Alexeev;

import java.util.Scanner;

public class Alexeev_0182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        double c1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y2-y1,2));
        double c2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        double c3 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        if (c1>c2 &&c1>c3){
            int a = x3,b=y3;
            x3=x1;
            y3=y1;
            x1=a;
            y1=b;
        } else if (c3>c1&&c3>c2){
            int a = x2,b=y2;
            x2=x1;
            y2=y1;
            x1=a;
            y1=b;
        }
        System.out.println((x2+x3-x1)+" "+(y2+y3-y1));
    }
}