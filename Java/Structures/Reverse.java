import java.util.Scanner;

public class Reverse{

    public static void main(String... args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();
    System.out.printf("The number reversed =", );
    Reverse.reverse(number);
}
    public static void reverse(int number){
    int reversed = 0;
    while(number > 0){
    int digits = number % 10;
    reversed = reversed * 10 + digits;
    
    number /= 10;
    
    }
    }
}
