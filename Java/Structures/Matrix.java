import java.util.Random;
import java.util.Scanner;

public class Matrix{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
    int number = input.nextInt();
    
    printMatrix(number);
    
    }
    public static void printMatrix(int n){
    Random input = new Random();
    
    for(int row = 0; row < n; row++){
    for(int column = 0; column < n; column++){
    int random = input.nextInt(2);
    System.out.print(random + " ");
    }
    System.out.println();
    }
    
    }
}
