import java.util.Scanner; // Import scanner class

public class QuickStart {
   public static void main(String[] args) {
    System.out.println("Hello, World.");

    int num1 = 5, 
        num2 = 10;
    int num3 = num1+num2;

    try(Scanner scan = new Scanner(System.in);){
        //Create Scanner object

        System.out.println("What does 5 + 10 equal?\n");

       

        try{
            int total = scan.nextInt(); //User Input

            if(total == num3){
                System.out.println("The answer is correct!");
                
                System.out.println("\nUser response: " + total +"\nCorrect Answer: " +
                num3);
            }
            else{
                System.out.println("The answer is incorrect.");

                
                System.out.println("\nUser response: " + total +"\nCorrect Answer: " +
                num3);
            }
        }
        catch(Exception e){
            System.out.println("Please enter an integer. No spaces and no letters.");
        }
    }

   }
}
