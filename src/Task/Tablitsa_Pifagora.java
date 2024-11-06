package Task;

import java.util.Scanner;

public class Tablitsa_Pifagora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 21; i++) {

            for (int j = 1; j < 21; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}