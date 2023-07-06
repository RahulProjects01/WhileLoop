
//   ----------- 123 revarce 432 ----------------------------------------------------

// Program:- 

public class File_8 {
    public static void main(String[] args) {
        int num=123,rem,sum1=0,sum = 0;
        while(num>0)
        {
            rem = num%10;
            sum = sum * 10 + rem+1;
            num = num/10;

        }
        while(sum>0)
        {
            rem = sum%10;
            sum1=sum1*10+rem;
            sum = sum/10;
        }
        System.out.println(sum1);
        
    }
}

