package Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class If_0_random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Random random = new java.util.Random() ;
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i1 = 0; i1<arr.length; i1++){
            if (arr[i1]==0){
                arr[i1] = random.nextInt(8)+1 ;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
