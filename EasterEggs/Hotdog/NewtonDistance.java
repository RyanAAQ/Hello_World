import java.util.Scanner;
    
    public class NewtonDistance{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter initial velocity");
    double u = input.nextDouble();
    
    System.out.println("Enter time span");
    double t = input.nextDouble();

    System.out.println("Enter acceleration");
    double a = input.nextDouble();

    double s = u * t + 0.5 * a * t * t;

    System.out.printf("Distance covered = %.2f meters\n", s);

    }
}
