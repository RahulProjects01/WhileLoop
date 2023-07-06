
// Q.17 1---100 3 and 7 ke multipal number ---------------------------------------------

// Program:- 

public class File_25 {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            if (a % 3 == 0 && a % 7 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}