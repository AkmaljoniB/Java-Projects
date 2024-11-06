package Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Razmer_Massive_Random {
    public static void main(String[] args) {
        Random random = new Random() ;
        int n = random.nextInt(9)+1 ;
        int []arr = new int[n];
        System.out.println(arr.length);
        for (int i = 0; i<arr.length; i++){
            arr [i] = random.nextInt(100) ;
        }
        System.out.println(Arrays.toString(arr));
    }
}
