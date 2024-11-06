package If;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double f=0 ;
        if (x<=0){
            f = -x;
        }
        if(0<x && x<2){
            f = x*x ;
        }
        if (x>=2){
            f=4 ;
        }
        System.out.println(f);
    }
}