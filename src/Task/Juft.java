package Task;

import java.util.Scanner;

public class Juft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int a = 0;
        int max = Integer.MIN_VALUE ;


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {

            if (i%2==0 && arr[i]>max){
                max = arr[i];
                a=arr[i];
            }
        }
        System.out.println(a);
    }
}
