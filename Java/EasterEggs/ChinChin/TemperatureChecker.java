import java.util.Scanner;
    
    public class TemperatureChecker{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the temperature in celsius ");
    double temp = input.nextDouble();

    if (temp < 0)
    System.out.println("Freezing");

    else if (temp <= 15)
    System.out.println("Cold");

    else if (temp <= 25)
    System.out.println("Warm");

    else
    System.out.println("Hot");
    
    }
}
