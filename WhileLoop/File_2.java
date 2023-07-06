//--------------------- Revarce number ----------------------------------

// Program:- 

import java.util.Scanner;

public class File_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value");
        int num = sc.nextInt();
        System.out.println(num);

        int rem, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
