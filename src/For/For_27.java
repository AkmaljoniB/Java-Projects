package For;

import java.util.Scanner;

public class For_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double rez = x, pow = x;
        double TempRez1 = 1;
        double TempRez2 = 1;
        for (int i = 1; i<n; i++){
            TempRez1= TempRez1*(2*i-1);
            TempRez2= TempRez2*(2*i);
            pow = pow*x*x;
            rez = rez+TempRez1*pow/(TempRez2*(2*i+1));
        }
        System.out.println(rez);
    }
}
