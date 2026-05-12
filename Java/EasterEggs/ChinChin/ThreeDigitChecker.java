import java.util.Scanner;

    public class ThreeDigitChecker{
        public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number ");
    int num = input.nextInt();

    if (num >= 100 && num <= 999)
    System.out.println(num +" is a 3 digit number");

    else 
    System.out.println(num + " is not a 3 digit number");
    
    }
}
