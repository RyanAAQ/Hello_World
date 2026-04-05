import java.util.Scanner;

    public class MonthlySavings{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);
 
    final double Monthlyrate = 0.003125;
       
    System.out.println("Enter your monthly saving amount ");
    double monthlysavings = input.nextDouble();
        
    double accountvalue = 0.0;
    for (int month = 1; month <= 6; month++) {

    accountvalue = (accountvalue + monthlysavings) * (1 + Monthlyrate);
        
    System.out.printf("After 6 months: $%.2f\n", accountvalue);
    }

}

}
