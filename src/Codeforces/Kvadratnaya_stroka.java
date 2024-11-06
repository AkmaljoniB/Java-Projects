package Codeforces;

import java.util.Scanner;

public class Kvadratnaya_stroka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = new String[Integer.parseInt(n)];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextLine();
            if (arr[i].substring(0,arr[i].length()/2).equals(arr[i].substring(arr[i].length()/2))){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}