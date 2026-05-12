import java.util.Scanner;

public class Pattern{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number you want to print to: ");
    int number = input.nextInt();
    
    displayPattern(number);
    }
    public static void displayPattern(int n){
        for(int row = 1; row <= n; row++){
        for(int column = 1; column <= row; column++){
        System.out.print(column + " ");
        }
        System.out.println();
    }
    }   
}

