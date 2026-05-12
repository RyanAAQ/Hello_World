import java.util.Scanner;
    
    public class ThreeDigitAdder{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a 3 digit number");
    int num = input.nextInt();

    int digit1 = num / 100;
    int digit2 = (num / 10) % 10;
    int digit3 = num % 10;

    int result = digit1 + digit2 + digit3;    
    
    System.out.println("The sum of the digits is " + result);

    }
}

    
