import java.util.Scanner;

    public class SumOfDigits{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your number betweeen one and 1k");
    int num = input.nextInt();

    int sum = 0;
    int temp = Math.abs(num);
    
    while (temp > 0) {
     sum += temp % 10;
     temp /= 10;
}

    System.out.printf("Sum of teh digits are %d%n", sum);

    }
}
