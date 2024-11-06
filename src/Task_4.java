import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a/1000;
        int c = a/100%10;
        System.out.println("Acри : "+(b*10+c+1));
    }
}
