import java.util.Scanner;

public class TaskEight{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int num = input.nextInt();

    int square = num * num * num;

    System.out.printf("The cube is %d%n", square);
    }
}
