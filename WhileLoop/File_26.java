
//  --------------------- 5 and 11 ke divide number --------------------------

// Program :- 

public class File_26 {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            if (a % 5 == 0 || a % 11 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
