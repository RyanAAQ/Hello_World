import java.util.Scanner;

public class TaskSix{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int total = 0;
    int counter = 1;
    int total2 = 0;

    while (counter > 0){
    System.out.println("Enter scores ");
    int scores = input.nextInt();

    if (scores >= 1 && scores <= 100){
    total = total + scores;

    } else {
    System.out.print("invalid score nga ");
}
counter++;
}
    System.out.println("sum = " + total);
    }
}
