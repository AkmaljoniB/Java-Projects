package For_and_Array;


import java.util.Scanner;

public class For_and_Array9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i ]) {
                System.out.println(arr[i]);
            }
        }
    }
}
