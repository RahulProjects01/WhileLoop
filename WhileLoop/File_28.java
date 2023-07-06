
// Q.20 -------------------------- 100-------1 user input ex- n or m se multipal se divisible-----------------

// Program:- 

import java.util.Scanner;

public class File_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.print("Enter b number: ");
        int num2 = sc.nextInt();
        System.out.println(num2);

        int a = 100;
        while (a >= 1) {
            if (a % num1 == 0 || a % num2 == 0) {
                System.out.println(a);
            }
            a--;
        }
    }
}
