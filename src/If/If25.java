package If;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double f=0 ;
        if (x<-2 || x>2){
            f = 2 * x;
        }
        if(x<=0){
            f = 6 - x ;
        }
        System.out.println(f);
    }
}
