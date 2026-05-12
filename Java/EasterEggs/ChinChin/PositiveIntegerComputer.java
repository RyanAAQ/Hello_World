import java.util.Scanner;

    public class PositiveIntegerComputer{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a positive number");
    int n = input.nextInt();

    int sum = n * (n + 1) / 2;

    System.out.println("Sum is " + sum);

    }
}
