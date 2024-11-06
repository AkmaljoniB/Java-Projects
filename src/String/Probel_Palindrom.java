package String;

import java.util.Scanner;

public class Probel_Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!(arr[i] == ' ')) {
                sb1.append(arr[i]);
            }
        }
        String str = String.valueOf(sb.append(sb1).reverse());
        System.out.println(sb1);

        if (str.equalsIgnoreCase(String.valueOf(sb1))) {
            System.out.println("palindrom ast");
        } else {
            System.out.println("palindrom nest");
        }
    }
}
