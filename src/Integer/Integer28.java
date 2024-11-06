package Integer;

import java.util.Scanner;

public class  Integer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K,N;
        System.out.println("K = ");
        K = scanner.nextInt();
        System.out.println("N = ");
        N = scanner.nextInt();
        System.out.println("Natija: "+ ((K+N-2)%7+1));
    }
}