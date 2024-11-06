package Codingbat.Array_3;

public class LinearIn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int[] arr1 = {2, 3, 4};
        System.out.println(linearIn(arr, arr1));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int a = 0;
        for (int j = 0; j < inner.length; j++) {
            for (int i = 0; i < outer.length; i++) {
                if (outer[i] == inner[j]) {
                    a++;
                    break;
                }
            }
        }
        if (a==inner.length){
            return true;
        }
        return false;
    }
}