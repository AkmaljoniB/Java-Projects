package If;

import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b;
        System.out.println("a= ");
        a=scanner.nextDouble();
        System.out.println("b= ");
        b=scanner.nextDouble();
        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
