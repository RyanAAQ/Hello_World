import java.util.Scanner;

public class Youtube{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double number1 = input.nextDouble();
    input.nextLine();

    System.out.print("Enter the second number: ");
    double number2 = input.nextDouble();
    input.nextLine();

    System.out.print("What operation do you want to perform: ");
    String operation = input.nextLine();

    switch (operation){
        case "sum":
    System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    break;
    default:
        System.out.printf("%s is not a supported operaation.", operation);
}

    }
}
