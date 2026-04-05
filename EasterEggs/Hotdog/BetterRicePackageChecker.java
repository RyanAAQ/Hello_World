import java.util.Scanner;

    public class BetterRicePackageChecker{
        public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter teh weight and price of the first package");
    double w1 = input.nextDouble();
    double p1 = input.nextDouble();

    System.out.println("Enter the weight and price of the second package");
    double w2 = input.nextDouble();
    double p2 = input.nextDouble();

    double ppu1 = p1 / w1;
    double ppu2 = p2 / w2;

    if (ppu1 < ppu2){

    System.out.println("The first package has a better price per unit ");
    } else if (ppu2 < ppu1) {

    System.out.println("The second package has a better price per unit ");
    } else {

    System.out.println("Both packages have the same prices per unit");
    }


        }
}



