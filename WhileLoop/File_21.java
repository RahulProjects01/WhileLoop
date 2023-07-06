
//   sum addition 1 to 10 number --------------------------------------------

// Program:- 

public class File_21{
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("The sum is: " + sum);
    }
}
