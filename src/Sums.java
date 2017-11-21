import java.util.Scanner;

public class Sums{
    public static void main(String []args){
        int n , sum = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int number = keyboard.nextInt();

        for(n = 0; n<= number; n++);{
            if((n%2)==1){
                sum +=n;

            }


        }
            System.out.print("Sum of all odd numbers of " + number + " ' "+ sum);

    }




}
