import java.util.Scanner;

    public class MileToKilometerConverter{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your number");
    double miles = input.nextDouble();

    double kilometer = miles * 1.6;

    System.out.printf("Your number in kilometer = " + kilometer);

    }
}
