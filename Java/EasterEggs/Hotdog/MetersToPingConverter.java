import java.util.Scanner;

    public class MetersToPingConverter{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter area in sqaure meters");
    double squaremeters = input.nextDouble();

    double ping = squaremeters * 0.3025;

    System.out.println(squaremeters + " Square meters = " + ping + "ping ");

    }
}
