import java.util.Scanner;

    public class WaterHeatingEnergy{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the amount of water in kg");
    double mass = input.nextDouble();

    System.out.println("Enter initial temperature in celcius");
    double initialtemp = input.nextDouble();

    System.out.println("Enter final temperature in celsius again");
    double finaltemp = input.nextDouble();

    double energy = mass * (finaltemp - initialtemp) * 4184;

    System.out.println("Energy needed is " + energy + " joules");

    }
}
