package For;

import java.util.Scanner;

public class For_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        double S = 0 ;
        for (int i=0; i<=N; i++){
            S += Math.pow((N+i),2);
        }
        System.out.println(S);
    }
}
