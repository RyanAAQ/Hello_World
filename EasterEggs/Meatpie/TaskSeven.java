import java.util.Scanner;

public class TaskSeven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int num1 = input.nextInt();

    int square = num1 * num1;

    System.out.printf("The square is %d%n", square);
    }
}
