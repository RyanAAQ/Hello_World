import java.util.Scanner;

public class ImpromptuClass{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int sum = 0;

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    while (num > 0){
    int d = num % 10;


    num /= 10;

    sum += d;
}

    System.out.println(sum);
    }
}
