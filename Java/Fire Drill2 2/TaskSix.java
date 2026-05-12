import java.util.Scanner;

public class TaskSix{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int total = 0;
    int counter = 1;
    int total2 = 0;

    while (counter <= 10){
    System.out.println("Enter scores ");
    int scores = input.nextInt();

    if (scores % 2 == 0)
    total = total + scores / 10;
    total2 = total + scores;
counter++;
}
    System.out.println("sum = " + total2);
    System.out.println("average = " + total);
    }
}
