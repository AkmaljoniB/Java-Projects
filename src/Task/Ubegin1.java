package Task;

import java.util.Scanner;

public class Ubegin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,a,b;
        System.out.println("A = ");
        a = scanner.nextDouble();
        System.out.println("B = ");
        b = scanner.nextDouble();
        x = 2/(((a*a+25)+b)/((a+b)/2)+Math.sqrt(b));
        y = (Math.abs(a)+2*Math.sin(b))/5.5*a ;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
