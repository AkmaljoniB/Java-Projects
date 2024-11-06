package Game;

import java.util.Random;
import java.util.Scanner;

public class Ugadai_Bukvu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String n = scanner.nextLine();
        int p = random.nextInt(26)+1;
        String alphabit = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = alphabit.toCharArray();
        for (int i1 = 0; i1 < alphabit.length(); i1++) {
            if (i1 == p) {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                        if (n.equals(arr[i])) {
                            System.out.println("Шумо ғолиб баромадед ҳарф " + arr[i1] + " мебошад");
                            break;
                        } else {
                            System.out.println("Шумо ғолибиятро аз даст додед аз нав дохил кунед ҳарф " + arr[i1] + " буд!");
                            p = random.nextInt(26)+1;
                            n = scanner.nextLine();
                        }
                    }
                }
            }
        }
    }