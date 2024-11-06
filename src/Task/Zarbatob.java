package Task;

import java.util.Scanner;

public class Zarbatob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int zarb = 1 ;
        for (int i=a; i<=b; i++) {
            zarb = zarb * i ;
        }
        System.out.println(zarb);
    }
}
