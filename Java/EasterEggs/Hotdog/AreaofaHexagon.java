import java.util.Scanner;

    public class AreaofaHexagon{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the side length ");
    double s = input.nextDouble();

    double area = (3 * Math.sqrt(3) / 2) * s * s;

    System.out.printf("Area is %s%n", area);
    }
}
