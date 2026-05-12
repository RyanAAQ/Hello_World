import java.util.Scanner;

public class TaskFive{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
    
    int product = num1 * num2;
    
    System.out.printf("The product is %d", product);
    
    }
}
