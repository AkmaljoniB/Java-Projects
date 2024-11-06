import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = 0;
        int s = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == s) {
                System.out.println(arr[i]);
                a++;
                break;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (a==1){
                break;
            }
            if (a==2){
                break;
            }
            for (int g = 1; g < n; g++) {
                if (arr[i] + arr[g] == s) {
                    System.out.println(arr[i]);
                    System.out.println(arr[g]);
                    a++;
                }
            }
        }
    }
}