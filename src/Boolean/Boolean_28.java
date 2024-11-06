package Boolean;

import java.util.Scanner;

public class Boolean_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println((x>0)&&(y>0)||(x<0)&&(y<0));
    }
}
