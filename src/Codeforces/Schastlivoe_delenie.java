package Codeforces;

import java.util.Scanner;

public class Schastlivoe_delenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  a= scanner.nextInt();
        int n =0;
        int[]arr = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
        for (int i = 0 ; i < arr.length;i++){
            if (a%arr[i]==0){
                System.out.println("YES");
                n++;
                break;
            }
        }
        if (n ==0){
            System.out.println("NO");
        }
    }
}
