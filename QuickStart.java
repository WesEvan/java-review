import java.util.InputMismatchException;
import java.util.Scanner; // Import scanner class

public class QuickStart {
   public static void main(String[] args) {
    System.out.println("Hello, World.");

    int num1 = 5, 
        num2 = 10;
    int num3 = num1+num2;

    try(Scanner input = new Scanner(System.in);){
        //Create Scanner object

        System.out.println("What does 5 + 10 equal?\n");

        int total = input.nextInt(); //User Input

        try{
            if(total == num3){
                System.out.println("The answer is correct!");
            }
            else{
                System.out.println("The answer is incorrect.");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Please enter an integer. No spaces and no letters.");
        }

        System.out.println("\nUser response: " + total +"\nCorrect Answer: " +
        num3);
    }

   }
}
