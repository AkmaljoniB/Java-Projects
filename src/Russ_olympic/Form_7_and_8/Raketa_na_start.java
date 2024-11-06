package Russ_olympic.Form_7_and_8;

import java.util.Scanner;

public class Raketa_na_start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = "";
        String p = "";
        int d = 0, f=0;
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i, i + 1).equals(" ")) {
                s1 = s1.concat(s.substring(i, i + 1));
            }
        }
        int[] arr = new int[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            arr[i] = Integer.parseInt(s1.substring(i, i + 1));
        }
//        for (int i = 1; i<10; i++){
//            for (int j = 0; j<arr.length; j++){
//                if (arr[j]==i && j>=d){
//                    p = p.concat(String.valueOf(i));
//                    i = i+1;
//                    d=j;
//                }
//            }
//        }
//        int[]arr = new int[s1.length()];
        for (int i = 0; i < arr.length; i++) {
            p = String.valueOf(arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i+d] < arr[j]) {
                    p = p.concat(String.valueOf(arr[j]));
                    d++;
                } else if (arr[i+d]>arr[j] && p.length()!=1 && arr[i]<arr[j]){
                 p = p.substring(0,i+d-f);
                 p = p.concat(String.valueOf(arr[j]));
                 f++;
                 d++;
                }
                if (j==arr.length-2 && d==1){
                    d=0;
                }
            }
            System.out.println(p);
            p = "";
            d=0;
            f=0;
        }
        int []arr1 = new int[arr.length];
    }
}
