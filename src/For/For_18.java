package For;

import java.util.Scanner;

public class For_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        double p=-1;
        double s =0;
        for (int i = 0; i < n; i++) {
            p *= -a;
            s += -p;
        }
        System.out.println(s+1);
    }
}
