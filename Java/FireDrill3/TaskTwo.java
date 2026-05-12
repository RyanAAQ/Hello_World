import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int[] scores = new int[10];

    for (int count = 0; count < scores.length; count++) {
    System.out.print("Enter score: ");
    scores[count] = input.nextInt();
}
    System.out.print("Scores = ");
    for(int num : scores){
    System.out.print(" " + num);
    }
    }
}

