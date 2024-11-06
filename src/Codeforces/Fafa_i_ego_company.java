package Codeforces;

import java.util.Scanner;

public class Fafa_i_ego_company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k =0;
        for (int i = 1 ; i < n;i++){
            if (n%i==0){
                k++;
            }
        }
        System.out.println(k);
    }
}