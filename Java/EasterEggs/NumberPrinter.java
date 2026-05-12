import java.util.Scanner;

public class NumberPrinter{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your number: ");
    int n = input.nextInt();
        
    int i = n;

    while (i >= 1) {
    System.out.println(i);
    
    i--;
    }
  }


}
