import java.util.Scanner;
    
    public class TimeConverter{
       public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of seconds ");
    int tseconds = input.nextInt();
    
    int hours = tseconds / 3600;
    int minutes = (tseconds % 3600) / 60;
    int seconds = tseconds % 60;

    System.out.println(tseconds + " seconds = " + hours + " hours " + minutes + " minutes " + seconds + " seconds ");

    }
}
