import java.util.Scanner;

public class LargestNumber{

    public static void main(String... args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter the first number: ");
    int firstnumber = input.nextInt();

    System.out.print("Enter the second number: ");
    int secondnumber = input.nextInt();

    System.out.print("Enter the third number: ");
    int thirdnumber = input.nextInt();

    int largestnumber = largest(firstnumber, secondnumber, thirdnumber);
    System.out.println("The largest number = " + largestnumber);
}
   public static int largest(int firstnumber, int secondnumber, int thirdnumber){
   int largest = 0;

    if (firstnumber > secondnumber && firstnumber > thirdnumber){
    largest = firstnumber;
}
    else if (secondnumber > firstnumber && secondnumber > thirdnumber){
    largest = secondnumber;
}    
    else{
    largest = thirdnumber;
}  
    return largest;
    }
}
