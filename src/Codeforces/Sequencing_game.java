package Codeforces;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sequencing_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr =new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            List<Integer> list = new ArrayList<>();
            arr[0] = scanner.nextInt();
            list.add(arr[0]);
            for (int i = 1; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i - 1] > arr[i]) list.add(arr[i]);
                list.add(arr[i]);
            }
            pr.println(list.size());
            for (int i = 0; i < list.size(); i++) pr.print(list.get(i) + " ");
            pr.println();
        }
        pr.close();
    }
}
