//  --------------------- factorial------------------------------------

// Program:- 

import java.util.Scanner;

public class File_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = sc.nextInt();
        int fact = 1, i;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
