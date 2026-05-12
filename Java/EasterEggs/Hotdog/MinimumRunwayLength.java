import java.util.Scanner;

    public class MinimumRunwayLength{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter take off speed (v)");
    double speed = input.nextDouble();

    System.out.println("Enter acceleration (a)");
    double acceleration = input.nextDouble();

    double runwaylength = speed * speed / (2 * acceleration);

    System.out.println("Minimum Runway Length is " + runwaylength + "meters");

    }
}
