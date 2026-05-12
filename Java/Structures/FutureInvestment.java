import java.util.Scanner;

public class FutureInvestment{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the investment amount: ");
    double investmentamount = input.nextDouble();
    
    System.out.print("Enter the annual interest rate in %: ");
    double annualinterest = input.nextDouble();
       
    double monthlyinterest = annualinterest / 12 / 100;
    
    System.out.print("Years   Future value");
    for(int years = 1; years <= 30; years++){
    double futurevalue = futureInvestmentValue(investmentamount, monthlyinterest, years);
     System.out.printf("%-7d %.2f%n", years, futurevalue);
     }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
    return investmentAmount * Math.pow(1 + monthlyInterestRate, years  * 12);
    
    }
}
