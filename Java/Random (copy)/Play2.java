import java.util.Scanner;

public class Play2{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    System.out.print("The factorial = " + factorial(number));
    }
    public static int factorial(int number){
    int sum = 1;
    
    for(int i = 1; i <= number; i++){
    sum *= i; 
    
    }
    return sum;
    
    }
}
