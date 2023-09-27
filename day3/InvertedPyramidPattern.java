import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = numRows; i >= 1; i--) {

            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }

        scanner.close();
    }
}
