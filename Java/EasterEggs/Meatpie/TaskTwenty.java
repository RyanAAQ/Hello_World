import java.util.Scanner;

public class TaskTwenty{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter length");
    double length = input.nextDouble();

    System.out.println("Enter Width");
    double width = input.nextDouble();

    double area = length * width;

    System.out.printf("Area is " + area);
    }
}
