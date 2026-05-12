import java.util.Scanner;

    
   public class MonthlyInterest{
     public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter balance ");
    double balance = input.nextDouble();

    System.out.println("Enter annual interest rate in % ");
    double annualinterestrate = input.nextDouble();

    double interest = balance * (annualinterestrate / 1200);

    System.out.println("Next months interest will be " + interest);

    }
}
