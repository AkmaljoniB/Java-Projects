package If;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c<b && c<a){
            System.out.println(c);
        }
        if (a<c && a<b){
            System.out.println(a);
        }
        if (b<a && b<c){
            System.out.println(b);
        }
    }
}