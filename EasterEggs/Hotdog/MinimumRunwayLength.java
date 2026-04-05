import java.util.Scanner;

    public class MinimumRunwayLength{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter take off speed (v)");
    double v = input.nextDouble();

    System.out.println("Enter acceleration (a)");
    double a = input.nextDouble();

    double runwaylength = v * v / (2 * a);

    System.out.println("Minimum Runway Length is " + runwaylength + "meters");

    }
}
