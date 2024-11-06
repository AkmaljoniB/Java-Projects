package Codingbat.Ap_1;

import java.util.Arrays;

public class ScoresAverage {
    public static void main(String[] args) {
        System.out.println(scoresAverage(new int[]{2, 2, 4, 4}));
    }
    public static int scoresAverage(int[] scores) {
        int[]arr1= new int[scores.length/2];
        int[]arr2= new int[scores.length/2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scores[i];
            arr2[i] = scores[i+arr1.length];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1[arr1.length/2]>=arr2[arr2.length/2]){
            return arr1[arr1.length/2];
        }
        return arr2[arr2.length/2];
    }
}