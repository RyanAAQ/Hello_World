import java.util.Scanner;

public class Horizons4{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int counter = 1;

    System.out.print("Enter a number nga: ");
    int num = input.nextInt();

    while (counter <= num){

    if (counter % 2 != 0)

          System.out.println(counter); 
   
    
counter++;
} 
    }
}
