//======================================================
// PrintName Application
// This application inputs a name & prints it in two different formats
//======================================================
// Necessary import to make use of BufferedReader class
import java.io.BufferedReader;

// Necessary import to make use of InputStreamReader class
import java.io.InputStreamReader;

// Necessary import to make use of IOException
import java.io.IOException;

public class PrintName{
    public static void main(String ... args) throws IOException{
        String firstName;                   // Person's first name
        String lastName;                    // Person's last name
        String middleName;                    // Person's middle name letter
        String lastFirst;                   // Name in last-first format
        String firstLast;                   // Name in first-last format

        //Input stream for strings
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first name: ");
        firstName = in.readLine();                  // Gets first name
        System.out.print("Enter last name: ");
        lastName = in.readLine();                   // Gets last name
        System.out.print("Enter middle name letter: ");
        middleName = in.readLine();                 //Gets middle name letter

        lastFirst = lastName + ", " + firstName + " ";     // Generates last-first format
        System.out.println("Name in last-first format: " + lastFirst + middleName + ".");

        firstLast = firstName + " " + middleName+ ". " + lastName;             // Generates fist-last format
        System.out.println("Name in first-last format: " + firstLast);
    }
}