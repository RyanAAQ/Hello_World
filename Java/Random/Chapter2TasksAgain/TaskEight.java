import java.util.Scanner;

public class TaskEight{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int num = input.nextInt();
    
    int cube = num * num * num;
    
    System.out.printf("The cube is %d", cube);
    
    }
}
