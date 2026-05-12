import java.util.Scanner;   

    public class SpeedCalculator{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the speed in (km/h)");
    int speed = input.nextInt();

    if (speed == 0)
    System.out.print("Stationary");
    
    else if (speed >= 1 && speed <= 40)
    System.out.println("Slow");

    else if (speed >= 41 && speed <= 80)
    System.out.println("Moderate");

    else if (speed >= 81 && speed <= 120)
    System.out.println("Fast");

    else
    System.out.println("Dangerously Fast");

    }
}
