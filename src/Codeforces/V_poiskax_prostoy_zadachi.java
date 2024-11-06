package Codeforces;

import java.util.Scanner;

public class V_poiskax_prostoy_zadachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a= 0;
        for (int i = 0 ; i<n;i++){
            int k = scanner.nextInt();
            if (k==1){
                System.out.println("HARD");
                a++;
                break;
            }
        }
        if (a==0){
            System.out.println("EASY");
        }
    }
}
