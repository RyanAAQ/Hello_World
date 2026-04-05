import java.util.Scanner;

    public class VolumeOfTriangularPrism{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter lenght of sides of equilateral triangle");
    double side = input.nextDouble();

    System.out.println("Enter length of prism");
    double length = input.nextDouble();

    double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);

    System.out.printf("The area is " + area);

   }
}
