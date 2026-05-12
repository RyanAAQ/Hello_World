import java.util.Scanner;
    
    public class SeniorCitizenDiscount{
        public static void main(String[] args){

     Scanner input = new Scanner(System.in);
    
    System.out.println("Enter your birth year");
    int byear = input.nextInt();
    
    System.out .print("Enter the current year"); 
    int cyear = input.nextInt();

    int age = cyear - byear;
    
    if (age == 65)
    System.out.println("You are eligible for the discount");

    else
    System.out.println("You are not eligible for the discount");

    }
}
