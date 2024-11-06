package String;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String source = scanner.nextLine();
        String delete = scanner.nextLine();
        source = source.replace(delete, "kmd");
        System.out.println(source);
    }
}