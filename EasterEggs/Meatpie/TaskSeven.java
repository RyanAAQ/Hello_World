import java.util.Scanner;

public class TaskSeven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int num = input.nextInt();

    int square = num * num;

    System.out.printf("The square is %d%n", square);
    }
}
