package Codeforces;

import java.io.*;

public class Trenirovka_Egora {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        String[] ars = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i % 3] += Integer.parseInt(ars[i]);
        }
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));

        if (max == arr[0]) System.out.println("chest");
        else System.out.println(max == arr[1] ? "biceps" : "back");
    }
}