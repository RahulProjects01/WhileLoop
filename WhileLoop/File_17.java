// ----------------------------------------------- 50-----1000 even number-----------------------------------------------------------

// Program:-

public class File_17 {
    public static void main(String[] args) {
        int number = 50;

        while (number <= 1000) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
