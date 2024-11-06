package If;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = 0 , p = 0 ;
        if (a>0&&a!=0) {
            k = k+1 ;
        } else {
            p = p + 1;
        }
        if (b>0 &&b!=0) {
            k = k+1 ;
        } else {
            p = p + 1;
        }
        if (c>0&&c!=0) {
            k = k+1 ;
        } else {
            p = p + 1;
        }
        System.out.println("Mysbi: "+k);
        System.out.println("Manfi: "+p);
    }
    }