package Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loto {
    public static void main(String[] args) {
        int[] Akmal = {3, 6, 18, 11, 23, 28, 34, 30, 48, 56, 52, 65, 64, 72, 85};
//        int[] Malim = {};
        int[] Mahnoz = {5, 19, 28, 22, 30, 37, 43, 46, 54, 58, 69, 71, 75, 82, 90};
        int[] Yosin = {2, 9, 17, 12, 21, 24, 38, 43, 46, 59, 60, 65, 73, 83, 87};
        int[] Bakha = {8, 6, 14, 28, 20, 39, 41, 46, 55, 62, 65, 70, 79, 82, 90};
        int ak = 0, b = 0, mah = 0, mal = 0, yo = 0;
        Random random = new Random();
        int[] arr = new int[90];
        int n = 0, l = 0;
        for (int i = 0; i < 1000; i++) {
            int a = random.nextInt(90) + 1;
            for (int j = 0; j < 90; j++) {
                if (arr[j] == a) {
                    n++;
                    break;
                }
                if (arr[j] == 0) {
                    arr[j] = a;
                    break;
                }
            }
            if (n == 0) {
                System.out.println(a);
                l++;
                for (int j = 0; j < 15; j++) {
                    if (Akmal[j] == a) {
                        Akmal[j] = 0;
                        ak++;
                    }
//                    if (Malim[j] == a) {
//                        Malim[j] = 0;
//                        mal++;
//                    }
                    if (Mahnoz[j] == a) {
                        Mahnoz[j] = 0;
                        mah++;
                    }
                    if (Yosin[j] == a) {
                        Yosin[j] = 0;
                        yo++;
                    }
                    if (Bakha[j] == a) {
                        Bakha[j] = 0;
                        b++;
                    }
                }
                if (ak != 15) {
                    System.out.println("Akmal " + Arrays.toString(Akmal) + " " + ak);
                }
//                if (mal != 15) {
//                    System.out.println("Umed " + Arrays.toString(Malim) + " " + mal);
//                }
                if (mah != 15) {
                    System.out.println("Mahnoz " + Arrays.toString(Mahnoz) + " " + mah);
                }
                if (yo != 15) {
                    System.out.println("Yosin " + Arrays.toString(Yosin) + " " + yo);
                }
                if (b != 15) {
                    System.out.println("Baktiyor " + Arrays.toString(Bakha) + " " + b);
                }
                Scanner scanner = new Scanner(System.in);
                String s = scanner.nextLine();
//                if (ak == 15) {
//                    System.out.println("Akma1 Br1d");
//                    ak++;
//                }
////                if (mal == 15) {
////                    System.out.println("Ma11m Br1d");
////                    mal++;
////                }
//                if (mah == 15) {
//                    System.out.println("Mahn0z Br1d");
//                    mah++;
//                }
//                if (yo == 15) {
//                    System.out.println("Y0s1n Br1d");
//                    yo++;
//                }
//                if (b == 15) {
//                    b++;
//                    System.out.println("Bakha Br1d");
//                }
            }
            n = 0;
            if (arr[arr.length - 1] != 0) {
                break;
            }
        }
        System.out.println("Конец игры " + l + " чисел");
    }
}