
//  --------------------- Revarce number +1 pattern ------------------- 

// Program:- 

import java.util.Scanner;

public class File_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value");
        int num = sc.nextInt();
        System.out.println(num);

        int rem, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem + 1;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
