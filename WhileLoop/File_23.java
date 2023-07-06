
// Q.15 ----------------------------- user input table ----------------------------------

// Program:-

import java.util.Scanner;

public class File_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(a);

        int i = 1;
        while (i <= 10) {
            int Result = a * i;
            System.out.println(Result);
            i++;
        }

    }
}