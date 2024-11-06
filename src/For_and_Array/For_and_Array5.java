package For_and_Array;

import java.util.Scanner;

public class For_and_Array5 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Razmer Massive");
        int n = scanner.nextInt();
        int[]arr = new int[n] ;
        int s = 0 ;
        int k = 0 ;
        int miona=0 ;
        for (int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] > 0) {
                s += (arr[i]);
                k++;
            }
            miona = s / k;
        }
            System.out.println(miona);
    }
}
