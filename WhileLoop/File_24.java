
//  ----------- 2 se 10 ke bich vale digit ki table print -----------------------------

// Program:-

import java.util.Scanner;

public class File_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int startNumber = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int endNumber = scanner.nextInt();

        int number = startNumber;
        while (number <= endNumber) {
            int counter = 1;
            System.out.println("Multiplication Table for " + number + ":");
            while (counter <= 10) {
                int result = number * counter;
                System.out.println(number + " * " + counter + " = " + result);
                counter++;
            }
            System.out.println(); // Print a blank line between tables
            number++;
        }
        scanner.close();
    }
}
