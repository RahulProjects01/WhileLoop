//-------------------------- prime number  ------------------------------------------

// Program:-

import java.util.Scanner;

public class File_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = 2;
        while (num > n) {
            if (num % n == 0) {
                System.out.println(" not prime");
                break;
            } else if (num - 1 == n) {
                System.out.print("prime");
                n++;
            }
        }
    }
}
