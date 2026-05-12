import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int largest = 0;
    int counter = 1;

while(counter <= 10){
    System.out.printf("Enter the %d number: ", counter);
    int number = input.nextInt();

if (number > largest)
    largest = number;

counter++;
}
    System.out.print("Largest number = " + largest);
    }
}
