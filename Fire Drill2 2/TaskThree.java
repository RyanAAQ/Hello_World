import java.util.Scanner;

public class TaskThree{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int total = 0;
    int counter = 1;
    int totals = 0;

    while (counter <= 10){
    System.out.println("Enter scores ");
    int scores = input.nextInt();

    total = total + scores / 10;
    totals = total + scores;
counter++;
}
    System.out.println("average is = " + total + " And sum = " + totals);
    }
}
