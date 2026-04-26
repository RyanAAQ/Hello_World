import java.util.Scanner;
    
    public class CylinderCalculator{
        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the radius of the cylinder ");
    double radius = input.nextDouble();
    
    System.out.println("Enter the height of the cylinder ");
    double height = input.nextDouble();

    double volume = Math.PI * (radius * radius) * height;
    double surfacearea = 2 * Math.PI * radius * height + (2 * Math.PI * radius * radius);

    System.out.println("Volume is " + volume);
    System.out.println("Surface area is " + surfacearea);

    }
}
