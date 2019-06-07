
/*
Demonstrate Hailstone sequence numbers using java and java.util.Scanner
*/
import java.util.Scanner;

class HailstoneSequence {
    public static void main(String... args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number of the sequence: ");
        n = in.nextInt(); // Gets the number from the user

        while (n != 1) { // Processes the number while it is not equals to 1
            System.out.print(n + " "); // Prints the number if it is not equals to 1
            if (n % 2 == 0) {
                n = n / 2; // Divide the number by 2 if it is even
            } else {
                n = 3 * n + 1;
            }
        }

        System.out.println(n); // Printes the last number if it is equals to 1
    }
}