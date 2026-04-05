import java.util.Scanner;

    public class MetersToFeetConverter{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter distance in meters ");
    double meters = input.nextDouble();

    double feet = meters * 3.2786;

    System.out.printf(meters + " meters = " + feet + " feet ");

    }
}
