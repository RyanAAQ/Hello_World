import java.util.Scanner;

    public class LargestNumber{    
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    int Largest = input.nextInt();

    System.out.print("Enter second number: ");
    int secondnumber = input.nextInt();

    if (secondnumber > Largest)
    Largest = secondnumber;

    System.out.print("Enter third number: ");
    int thirdnumber = input.nextInt();
    
    if (thirdnumber > Largest)
    Largest = thirdnumber;

    System.out.print("Enter fourth number: ");
    int fourthnumber = input.nextInt();

    if (fourthnumber > Largest)
    Largest = fourthnumber;

    System.out.print("Enter fifth number: ");
    int fifthnumber = input.nextInt();

    if (fifthnumber > Largest)
    Largest = fifthnumber;

    System.out.println("The largest number is " + Largest);

    }
}
