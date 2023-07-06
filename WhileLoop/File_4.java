
// Q.4 ------------------------- Pallindrome number ----------------------------------------

// Program:- 

import java.util.Scanner;

public class File_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value");
        int num = sc.nextInt();
        System.out.print(num);

        int rem, sum = 0;
        int temp = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.print("this is pallindrome number");
        } else {
            System.out.print("this is not pallindrome");
        }

    }
}
