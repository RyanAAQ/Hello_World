import java.util.Scanner;

public class KataKata{
    public static void main(String... args){
    Scanner input = new Scanner(System.in);
    
     int [] number = new int [10];
     
     for(int count = 0; count < number.length; count++){
     System.out.print("Enter a number: ");
     number[count] = input.nextInt();
}
    for(int count = 0; count < number.length; count++)
     System.out.print(number[count] + " ");     
    }
}
