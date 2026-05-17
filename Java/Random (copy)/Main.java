import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
     int start2 = 0;
    for(int i = 1; i <= 10; i++){
    System.out.println("Enter 10 numbers");
    int start = input.nextInt();

     start2 = start2 + start;

}
    System.out.println(start2);
    }
}
