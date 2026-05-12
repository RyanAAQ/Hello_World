import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = input.nextInt();
        
    for (int row = 1; row <= rows; row++){
    for (int second = 1; second <= row; second++){
    System.out.print("*");
}
  System.out.println();
  }
    }   
}

