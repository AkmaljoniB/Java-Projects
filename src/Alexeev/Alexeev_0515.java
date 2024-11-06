package Alexeev;

import java.util.Scanner;

public class Alexeev_0515 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        double s =0;
        int x1 =0,y1=0;
        for (int i = 0; i < n; i++) {
            int x =scanner.nextInt();
            int y =scanner.nextInt();
            s+=Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
            x1=x;
            y1=y;
        }
        s+=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
        String str = String.format("%.3f",s).replace(",",".");
        System.out.println(str);
    }
}