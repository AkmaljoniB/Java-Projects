package Game;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10 ;
        int []arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr [i] = random.nextInt(99)+1 ;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == 4 || arr[i] == 40 || arr[i] == 89 || arr[i] == 10) {
                System.out.println("Shumo golib omaded: " + arr[i]);
                break;
            }
        }
    }
}
