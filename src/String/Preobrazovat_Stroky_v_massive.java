package String;

import java.util.Arrays;
import java.util.Scanner;

public class Preobrazovat_Stroky_v_massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(Arrays.toString(StrinToArray(str)));
    }
    public static String[] StrinToArray(String str){
        int a = 1;
        for (int i = 0; i<str.length();i++){
            if (str.substring(i,i+1).equals(" ")){
                a++;
            }
        }
        String[] arr = new String[a];
        for (int i = 0 ;i <str.length();i++){
            if (str.substring(i,i+1).equals(" ")){
                for (int j = 0 ; j<a;j++){
                    if (arr[j] == null){
                        arr[j]=str.substring(0,i);
                        str = str.substring(i+1);
                        break;
                    }
                }
            }
        }
        arr[a-1]=str;
        return arr;
    }
}