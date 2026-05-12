import java.util.Scanner;
    
    public class MandNcomputer{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int m = input.nextInt();
    
    System.out.println("Enter second number");
    int n = input.nextInt();

    if (n == 0){
    System.out.println("Number is not divisible by zero");
    
    } else {
    double result = (double) m / n;
    
    System.out.println("m/n = " + result);

        }
    }
}
