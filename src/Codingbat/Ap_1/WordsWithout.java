package Codingbat.Ap_1;

import java.util.Arrays;

public class WordsWithout {
    public static void main(String[] args) {
        String[]arr = {"a","b","c","a"};
        System.out.println(Arrays.toString(wordsWithout(arr,"a")));
    }
    public static String[] wordsWithout(String[] words, String target) {
        int a = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                a++;
            }
        }
        String[]arr = new String[a];
        for (int i= 0; i<arr.length;i++){
            arr[i]="";
        }
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                for (int j =0;j<arr.length;j++){
                    if (arr[j].equals("")){
                        arr[j] = arr[j].concat(words[i]);
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
