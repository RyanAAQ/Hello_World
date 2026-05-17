import java.util.Scanner;

public class Horizons5{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int counter = 1;
    int sum = 0;
   
    System.out.print("Enter a number nga: ");
    int num = input.nextInt();
     
    while (counter <= num){
    sum += counter;
counter++;
} 
         System.out.println(sum); 
    }
}
