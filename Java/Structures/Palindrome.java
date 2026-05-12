import java.util.Scanner;

public class Palindrome{

    public static void main(String... args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();
    int reverse = Palindrome.reverse(number);
    System.out.printf("The number reversed = %d%n", reverse);
    
    if(isPalindrome(number)){
    System.out.print(number + " is a palindrome ");
    
    }else {
    System.out.print(number + " is not a palindrome");
}
}
    public static int reverse(int number){
    int reversed = 0;
    while(number > 0){
    int digits = number % 10;
    reversed = reversed * 10 + digits;
    
    number /= 10;  
    }
    return reversed;
}
    public static boolean isPalindrome(int number){
    return number == reverse(number);
    
    }
}
