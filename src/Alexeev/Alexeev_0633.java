package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        System.out.print(team + ": ");
        String[]arr = {name1, name2, name3};
        Arrays.sort(arr);
        for (int i =0; i<arr.length-1; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[2]);
//        String ALPHABIT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String alphabit = "abcdefghijklmnopqrstuvwxyz";
//        char[] arr = ALPHABIT.toCharArray();
//        char[] arr1 = alphabit.toCharArray();
//
//        int n1 = 0, n2 = 0, n3 = 0, na1 = 0, na2 = 0, na3 = 0;
//        for (int i = 0; i < ALPHABIT.length(); i++) {
//            if (name1.charAt(0) == arr[i]) {
//                n1 = i+1;
//            }
//            if (name2.charAt(0) == arr[i]) {
//                n2 = i+1;
//            }
//            if (name3.charAt(0) == arr[i]) {
//                n3 = i+1;
//            }
//            if (name1.charAt(0) == arr1[i]) {
//                na1 = i+1;
//            }
//            if (name2.charAt(0) == arr1[i]) {
//                na2 = i+1;
//            }
//            if (name3.charAt(0) == arr1[i]) {
//                na3 = i+1;
//            }
//        }
//        if (n1!=0 || n2!=0 || n3!=0) {
//            if (n1 < n2 && n1 < n3 && n1!=0) {
//                System.out.print(name1);
//            } else if (n2 < n1 && n2 < n3 && n2!=0) {
//                System.out.print(name2);
//            } else if (n3 < n2 && n3 < n1 && n3!=0) {
//                System.out.print(name3);
//            }
//            if (n1 < n2 && n2 < n3 || n2 < n1 && n3 < n2) {
//                System.out.print(", "+name2 + ", ");
//            } else if (n2 < n1 && n1 < n3 || n1 < n2 && n3 < n1) {
//                System.out.print(", "+name1 + ", ");
//            } else if (n2 < n3 && n3 < n1 || n3 < n2 && n1 < n3) {
//                System.out.print(", "+name3 + ", ");
//            }
//            if (n1 > n2 && n1 > n3) {
//                System.out.print(name1);
//            } else if (n2 > n1 && n2 > n3) {
//                System.out.print(name2);
//            } else if (n3 > n2 && n3 > n1) {
//                System.out.print(name3);
//            }
//            if (n1==n2 && n2==n3){
//                System.out.println(name1+", "+ name2+", "+name3);
//            }
//        }
//        if (na1!=0 || na2!=0 || na3!=0) {
//            if (na1 < na2 && na1 < na3) {
//                System.out.print(name1 + ", ");
//            } else if (na2 < na1 && na2 < na3) {
//                System.out.print(name2 + ", ");
//            } else if (na3 < na2 && na3 < na1) {
//                System.out.print(name3 + ", ");
//            }
//            if (na1 < na2 && na2 < na3 || na2 < na1 && na3 < na2) {
//                System.out.print(name2 + ", ");
//            } else if (na2 < na1 && na1 < na3 || na1 < na2 && na3 < na1) {
//                System.out.print(name1 + ", ");
//            } else if (na2 < na3 && na3 < na1 || na3 < na2 && na1 < na3) {
//                System.out.print(name3 + ", ");
//            }
//            if (na1 > na2 && na1 > na3) {
//                System.out.print(name1);
//            } else if (na2 > na1 && na2 > na3) {
//                System.out.print(name2);
//            } else if (na3 > na2 && na3 > na1) {
//                System.out.print(name3);
//            }
//            if (na1==na2 && na2==na3){
//                System.out.println(name1+", "+ name2+", "+name3);
//            }
//        }
    }
}