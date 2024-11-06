package Codeforces;

import java.io.*;
import java.util.Arrays;

public class Postroyte_pryamougolnik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String[] ars = br.readLine().split(" ");
            int[] arr = {Integer.parseInt(ars[0]), Integer.parseInt(ars[1]), Integer.parseInt(ars[2])};
            Arrays.sort(arr);
            if ((arr[0] + arr[1] == arr[2]) || (arr[1] == arr[2] && arr[0] % 2 == 0)||(arr[0] == arr[1] && arr[2] % 2 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}