import java.util.Scanner;

public class TaskTwentyOne{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter base");
    double base = input.nextDouble();

    System.out.println("Enter height");
    double height= input.nextDouble();

    double area = 0.5 * base * height;

    System.out.printf("Area is " + area);
    }
}
