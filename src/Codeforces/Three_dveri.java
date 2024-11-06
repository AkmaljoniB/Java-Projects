package Codeforces;

import java.io.*;

public class Three_dveri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(ars[0]);
            arr[1] = Integer.parseInt(ars[1]);
            arr[2] = Integer.parseInt(ars[2]);
            if (arr[x - 1] != 0 && arr[arr[x - 1]-1] != 0 && arr[arr[x - 1]-1] != x && arr[arr[x - 1]-1] != arr[x - 1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}