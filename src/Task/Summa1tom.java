package Task;

import java.util.Scanner;

public class Summa1tom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        double g=0 ;
        for (int i = 0;i<=m; i++){
            g=g+i;
        }
        System.out.println(g);
    }
}
