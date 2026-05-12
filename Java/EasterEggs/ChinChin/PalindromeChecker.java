import java.util.Scanner;

    public class PalindromeChecker{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a 3 digit number ");
    int num = input.nextInt();

    int first = num / 100;
    int last = num % 10;
    
    if (first == last)
     System.out.println(num + " is a palindrome ");
    
    else
    System.out.println(num + " is not a palindrome");

    }
}
