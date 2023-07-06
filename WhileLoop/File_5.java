
// ------- ------------------- Armstrong number ---------------------------------

// Program:- 

import java.util.Scanner;

public class File_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem, sum = 0;
        ;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;

            if (temp == sum) {
                System.out.println("number is armstrong");

            } else {
                System.out.print("not armstrong number");
            }
        }
    }
}
