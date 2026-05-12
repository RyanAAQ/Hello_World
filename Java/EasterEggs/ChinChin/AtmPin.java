import java.util.Scanner;

   public class AtmPin{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your pin");
    int pin = input.nextInt();

    if (pin == 1234) 
    System.out.println("Balance = $1000");

     else 
    System.out.println("Incorrect pin");

    }


}
