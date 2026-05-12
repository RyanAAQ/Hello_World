import java.util.Scanner;

public class TaskNine{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter you favourite colour: ");
    String colour = input.nextLine();
    
    System.out.printf("Your favourite colour is %s", colour);
    
    }
}
