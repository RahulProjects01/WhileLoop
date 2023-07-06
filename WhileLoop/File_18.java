
//  --------- user input 37-----67  bech vale digit print hone chaiye---------------------------------

// Program:- 

import java.util.Scanner;

public class File_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.println(b);

        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
}
