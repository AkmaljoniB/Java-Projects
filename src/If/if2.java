package If;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a;
        System.out.println("a= ");
        a=scanner.nextDouble();
        if (a>0){
            System.out.println(a+1);
        }else {
            if (a<0){
                System.out.println(a-2);
            }
        }
    }
}
