import java.util.Scanner;

    public class Loops{
        public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your number nga: ");
    int number = input.nextInt();

    while(number > 0){
    int d = number % 10;

    number /= 10;

  int square = d * d;
    
     System.out.println(square);

    
 }
    }
}

