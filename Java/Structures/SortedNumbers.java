import java.util.Scanner;

public class SortedNumbers{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    double num1 = input.nextDouble();
    
    System.out.print("Enter the second number: ");
    double num2 = input.nextDouble();

    System.out.print("Enter the third number: ");
    double num3 = input.nextDouble();
    
    displaySortedNumbers(num1, num2, num3);
}
    public static void displaySortedNumbers(double num1, double num2, double num3){
    double largest = num1;
    double middle = num2; 
    double smallest = num3;
    
    if(num2 > largest)
    largest = num2;
    if(num3 > largest)
    largest = num3;
    
    if(num2 < smallest)
    smallest = num2;
    if(num1 < smallest)
    smallest = num1;
    
    middle = (num1 + num2 + num3) - (largest + smallest);
    System.out.println("Numbers in decreasing order = " + largest + " " + middle + " " + smallest);
    }
}
