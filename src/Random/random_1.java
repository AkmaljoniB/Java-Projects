package Random;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class random_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = random.nextInt(40) + 60;
            for (int j = 0; j < 30; j++) {
                if (j < i) {
                    if (arr[i] == arr[j]) {
                        j = 0;
                        arr[i] = random.nextInt(40) + 60;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int p=0;
        for (int i = 1; i < 4; i++) {
            for (int j = 0+p; j < 10*i; j++) {
                System.out.print(arr[j] + " ");
            }
            p=p+10;
            System.out.println();
        }
    }
}
