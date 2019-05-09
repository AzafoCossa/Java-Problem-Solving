//======================================================
// ScannerDemo Application
// This application inputs a name & prints it in two different formats
//======================================================
// Necessary import to make use of Scanner class
import java.util.Scanner;

public class ScannerDemo{
    public static void main(String ... args){
        String firstName;                   // Person's first name
        String lastName;                    // Person's last name
        String middleName;                    // Person's middle name letter
        String lastFirst;                   // Name in last-first format
        String firstLast;                   // Name in first-last format

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = in.next();                  // Gets first name
        System.out.print("Enter last name: ");
        lastName = in.next();                   // Gets last name
        System.out.print("Enter middle name letter: ");
        middleName = in.next();                 //Gets middle name letter

        lastFirst = lastName + ", " + firstName + " ";     // Generates last-first format
        System.out.println("Name in last-first format: " + lastFirst + middleName + ".");

        firstLast = firstName + " " + middleName+ ". " + lastName;             // Generates fist-last format
        System.out.println("Name in first-last format: " + firstLast);
    }
}