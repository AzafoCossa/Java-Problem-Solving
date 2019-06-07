
// Demonstrate the Hailstone Numbers Algorithim using ArrayList
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class HailstoneSequenceArrayList {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); // Initialize an empty List

        System.out.print("Enter the first number of the sequence: ");
        int n = in.nextInt(); // Gets the initial number of the sequence
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(n);
        System.out.println(list);
    }
}