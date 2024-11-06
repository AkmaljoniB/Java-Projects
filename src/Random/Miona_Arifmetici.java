package Random;

import java.util.Arrays;
import java.util.Random;

public class Miona_Arifmetici {
    public static void main(String[] args) {
        Random random = new Random() ;
        int s = 0;
        int g ;
        int n = random.nextInt(9)+1;
        int[]arr = new int[n] ;
        System.out.println("Darozi: "+arr.length);
        for (int i = 0; i<arr.length; i++){
            arr[i] =random.nextInt(100);
            s += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        g = s / arr.length;
        System.out.println("Cumma: "+s);
        System.out.println("Mionai Arifmetice: "+g);
    }
}
