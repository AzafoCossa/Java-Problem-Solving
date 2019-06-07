
// Demonstrate the Hailstone Numbers Alghorithim using array
import java.util.Scanner;

class HailstoneSequenceArray {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[100]; // Initialize an array of integer that can hold 100 items
        int i = 0;
        System.out.print("Enter the first number of the sequence: ");
        int n = in.nextInt(); // Gets the initial number of the sequence
        while (n != 1) {
            System.out.print(n + " ");
            a[i] = n;
            i++; // Shorthand for i = i + 1
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
        a[i] = n;
        i++;
    }
}