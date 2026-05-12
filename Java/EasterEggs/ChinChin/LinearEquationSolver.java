import java.util.Scanner;

    public class LinearEquationSolver{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a, b, c ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    if (a == 0)
    System.out.println("No solution");
    
    else {
    double x = (c - b) / a;
    System.out.println("x = " + x);

    }
}

}
