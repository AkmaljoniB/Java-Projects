package Task;

import java.util.Scanner;

public class Proc_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(isPrime2(arr));
//        isPrime(n);
    }

    public static void isPrime(int n) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            if ((s <= 3) || (s == 5) || (s % 2 != 0 && s % 3 != 0 && s % 5 != 0 && s % 7 != 0 && s % 9 != 0 && s % 11 != 0 && s % 13 != 0)) {
                System.out.println(true);
                count++;
            } else {
                System.out.println(false);
            }
        }
        System.out.println("Количество простых чисел равно: " + count);
    }

    public static int isPrime2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]<=3) || (arr[i]==5) || (arr[i]%2!=0 && arr[i]%3!=0 && arr[i]%5!=0 && arr[i]%7!=0 && arr[i]% 9!=0 && arr[i]%11!=0 && arr[i]%13!=0)) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.print("\nКоличество простых чисел равно: ");
        return count;
    }
}