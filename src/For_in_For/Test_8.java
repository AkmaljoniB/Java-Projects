package For_in_For;

public class Test_8 {

    public static void main(String[] args) {
        for (int i = 25; i > 10; i--) {
            for (int j = 16; j > i; j--) {
                System.out.print("  " + (j - i +29));
            }
            System.out.println();
        }
    }
}