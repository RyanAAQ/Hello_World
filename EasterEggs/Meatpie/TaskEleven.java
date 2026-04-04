import java.util.Scanner;

public class TaskEleven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int num = input.nextInt();

    int answer = num / 2;

    System.out.printf("The answer is %d%n", answer);
    }
}
