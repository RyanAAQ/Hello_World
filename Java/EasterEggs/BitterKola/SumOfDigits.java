import java.util.Scanner;
    
    public class SumOfDigits{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a 5 digit number");
    int num = input.nextInt();

    int Digit5 = num % 10;
    num /= 10;

    int Digit4 = num % 10;
    num /= 10;
    
    int Digit3 = num % 10;
    num /= 10;

    int Digit2 = num % 10;
    num /= 10;

    int Digit1 = num % 10;
    num /= 10;

    int sum = Digit5 + Digit1;

    System.out.println("The sum of the first and last number is " + sum);

    }
}
