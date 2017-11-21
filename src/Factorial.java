import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.Scanner;

public class Factorial {


        public static void main(String args[]){
            Sums.main(args);// finds the sum
            int n ,fact=1;

            Scanner keyboard = new Scanner(System.in);// allows user input
            int number = Integer.parseInt(keyboard.next());
            System.out.print("Find factorial");

            for(n=1;n<=number;n++){
                fact=fact* n;
            }
            System.out.println("Factorial of "+number+" is: "+fact);


            int n1=0,n2=1,n3,i,count=10;
            System.out.print(n1+ " "+n2);

            for (i=2;i<count;++i)
            {
                n3=n1 + n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;



            }
        }
    }




