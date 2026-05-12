import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a positive number bruh: ");
    int num = input.nextInt();

    int reversed = 0;

    while (num > 0) {
    int digits = num % 10;
    reversed = reversed * 10 + digits;

    num = num / 10;

}
    System.out.println("Your number reversed is " + reversed);
    }
}


