package Codeforces;

import java.io.*;

public class Kratchayshiy_put_s_prepyatstviem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = 0;
            String s = br.readLine();
            String[] arr = br.readLine().split(" ");
            int xa = Integer.parseInt(arr[0]);
            int ya = Integer.parseInt(arr[1]);
            arr = br.readLine().split(" ");
            int xb = Integer.parseInt(arr[0]);
            int yb = Integer.parseInt(arr[1]);
            arr = br.readLine().split(" ");
            int xc = Integer.parseInt(arr[0]);
            int yc = Integer.parseInt(arr[1]);
            k += Math.abs(xb - xa);
            k += Math.abs(yb - ya);
            if (ya == yb && yb == yc) {
                if ((xa<xc && xc<xb) ||(xb<xc && xc<xa)){
                    k+=2;
                }
            }
            if (xa == xb && xb == xc) {
                if ((ya<yc && yc<yb) ||(yb<yc && yc<ya)){
                    k+=2;
                }
            }
            System.out.println(k);
        }
    }
}