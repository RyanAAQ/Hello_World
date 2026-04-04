import java.util.Scanner;

public class TaskSixteen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int num = input.nextInt();

    int answer = num * 5;

    System.out.printf("Your number multiplied by 5 is %d%n", answer, answer);
    }
}
