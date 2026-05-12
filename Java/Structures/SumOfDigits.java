import java.util.Scanner;

public class SumOfDigits{

    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    long number = input.nextInt();
    
    int answer = SumOfDigits.sumDigits(number);
    
    System.out.print("The sum of the digits = " + answer);
}
    
    public static int sumDigits(long n){
    int total = 0;
    while (n > 0){
    total += n % 10;
    n /= 10;    
    }
        return total;
    }
}
