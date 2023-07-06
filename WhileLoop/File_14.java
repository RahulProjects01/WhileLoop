
// Q.6 ----------------------------------------------- 100-----1 odd number ---------------------------------------

// Program :- 

public class File_14{
    public static void main(String[] args) {
        int number = 100;

        while (number >= 1) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number--; // Decrement by 1 to get the previous number
        }
    }
}
