import java.util.Scanner;

    public class PinCoder{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your pin");
    int pin = input.nextInt();
    
    if (pin >= 1000 && pin <=9999)
    System.out.println("Valid pin");

    else
    System.out.println("Invalid pin");

    }
}
