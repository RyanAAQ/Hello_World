import java.util.Scanner;

    public class GratuityAndTotalCalculator{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter subtotal");
    double subtotal = input.nextDouble();

    System.out.println("Enter gratuity rate (%) ");
    double gratuityrate = input.nextDouble();

    double gratuity = subtotal * (gratuityrate / 100);
    double total = subtotal + gratuity;

    System.out.printf("Gratuity $%.2f\n", gratuity);
    System.out.printf("Total: $%.2f\n", total);

    }
}
