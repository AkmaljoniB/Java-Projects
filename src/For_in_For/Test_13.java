package For_in_For;

public class Test_13 {
    public static void main(String[] args) {
        for (int i = 30; i>6; i++){
            for (int g = 0; g<i; g++) {
                if (i % 2 == 0) {
                    System.out.print("0 1 0 1 ");
                } else {
                    System.out.print("1 0 1 0 ");
                }
            }
            System.out.println();
        }
    }
}
