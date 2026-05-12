import java.util.Scanner;

    public class DiscountAndPrice{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter initial price");
    double price = input.nextDouble();
    
    System.out.println("Enter the discount in %");
    double discount = input.nextDouble();

    double value =  price * (discount / 100);
    double disamount = price - value;

    System.out.println("Final price = " + disamount);

    }
}
    
