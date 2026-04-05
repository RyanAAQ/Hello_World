import java.util.Scanner;

    public class DecreasingOrderConverter{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the three numbers");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    int min = Math.min(num1, Math.min(num2, num3));
    int max = Math.max(num1, Math.max(num2, num3));
    
    System.out.println("Minimum number is " + min);
    System.out.println("Maximum number is " + max);

    }
}
