import java.util.Scanner;

public class TaskOne{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int total = 0;
    int counter = 1;

    while (counter <= 10){
    System.out.println("Enter scores ");
    int scores = input.nextInt();

    total = total + scores / 10;
counter++;
}
    System.out.println("sum = " + total);
    }
}
