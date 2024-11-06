package Alexeev;

import java.util.Scanner;

public class Alexeev_0854 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String s = scanner.nextLine();
        String f = "";
        int t = 0, ty =0;
        for (int i = 0; i < p.length(); i++) {
            if (!p.substring(i, i + 1).equals(" ")) {
                f = f.concat(p.substring(i, i + 1));
            } else {
                t =Integer.parseInt(f);
                f= "";
            }
        }
        ty = Integer.parseInt(f);
        if ((t <= ty && s.equals("heat")) || (t <= ty && s.equals("auto")) || (t > ty && s.equals("freeze")) || (t > ty && s.equals("auto"))) {
            System.out.println(ty);
        } else if ((t <= ty && s.equals("freeze")) || (t <= ty && s.equals("fan")) || (t > ty && s.equals("heat"))) {
            System.out.println(t);
        } else {
            System.out.println(t);
        }
    }
}