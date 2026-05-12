import java.util.Scanner;
    
    public class NewtonDistance{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter initial velocity");
    double velocity = input.nextDouble();
    
    System.out.println("Enter time span");
    double time = input.nextDouble();

    System.out.println("Enter acceleration");
    double acceleration = input.nextDouble();

    double distance = (velocity * time) + 0.5 * acceleration * (time * time);

    System.out.printf("Distance covered = %.2f meters\n", distance);

    }
}
