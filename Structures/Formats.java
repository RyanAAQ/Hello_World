import java.util.Scanner;

public class Formats{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
    int number = input.nextInt();
    
    System.out.print("Enter width: ");
    int width = input.nextInt();
    
    String formated = format(number, width);
    System.out.print(formated);
    
    }    
    public static String format(int number, int width){
    return String.format("%0" + width + "d", number);
    
    }
}
