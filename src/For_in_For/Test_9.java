package For_in_For;

public class Test_9 {

    public static void main(String[] args) {

        for (int i = 15; i > 10; i--) {

            for (int j = 16; j > i; j--) {
                System.out.print("  " + (j - i -1));
            }
            System.out.println();
        }
    }
}
