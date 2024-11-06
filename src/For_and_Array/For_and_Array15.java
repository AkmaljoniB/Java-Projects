package For_and_Array;

import java.util.Arrays;
import java.util.Scanner;

public class For_and_Array15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[7];

        str[0] = "Якшанбе";
        str[1] = "Душанбе";
        str[2] = "Сешанбе";
        str[3] = "Чоршанбе";
        str[4] = "Панҷшанбе";
        str[5] = "Ҷумъа";
        str[6] = "Шанбе";

        for (int i = 0; i < str.length; i++) {
            int a = scanner.nextInt();
            if (a == 0) System.out.println(str[a]);
            if (a == 1) System.out.println(str[a]);
            if (a == 2) System.out.println(str[a]);
            if (a == 3) System.out.println(str[a]);
            if (a == 4) System.out.println(str[a]);
            if (a == 5) System.out.println(str[a]);
            if (a == 6) System.out.println(str[a]);
            if (a >  6) System.out.println("Ихел руз нест!! ");
        }
    }
}
