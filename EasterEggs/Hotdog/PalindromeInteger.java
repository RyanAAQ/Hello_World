import java.util.Scanner;

    public class PalindromeInteger{
        public static void main(String[] args);

    Scanner input = new Scanner(System.in);
        
    System.out.println("Enter a three digit number ");
    int num = input.nextInt();
    int first = num / 100;
    int last = num % 10;
    if (first == last) {
    System.out.println(num + " is a palindrome");
}
     else {
    Sytem.out.println(num + " is not a palindrome");


    }
}
