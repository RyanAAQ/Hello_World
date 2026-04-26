import java.util.Scanner;

public class Patterns3{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = input.nextInt();
            
    for (int row = 1; row <= rows; row++){
    for (int space = 1; space <= rows - row; space++){
    System.out.print(" ");
}
   for (int star = 1; star <= row; star++){
   System.out.print("*");
}
   System.out.println();
        }
    }   
}

