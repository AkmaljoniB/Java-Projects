package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ne_krasit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]);
            int r = Integer.parseInt(ars[2]);
            int c = Integer.parseInt(ars[3]);
            int l = -1;
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
                if (l == -1 && arr[i].contains("B")) {
                    l = 2;
                }
            }
            if (arr[r - 1].substring(c - 1, c).equals("B")) {
                l = 0;
            } else {
                for (int i = 0; i < n; i++) {
                    if (arr[i].substring(c - 1, c).equals("B")) {
                        l = 1;
                        break;
                    }
                }
                if (l!=1){
                    for (int i = 0 ; i<arr[0].length();i++){
                        if (arr[r - 1].substring(i, i + 1).equals("B")){
                            l=1;
                            break;
                        }
                    }
                }
            }
            System.out.println(l);
        }
    }
}