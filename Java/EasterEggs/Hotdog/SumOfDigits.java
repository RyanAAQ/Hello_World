import java.util.Scanner;

    public class SumOfDigits{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your number betweeen one and 1k");
    int num = input.nextInt();

    int sum = 0;
    int digits = num;
    
    while (digits > 0) {
     sum += digits % 10;
     digits /= 10;
}

    System.out.printf("Sum of teh digits are %d%n", sum);

    }
}
